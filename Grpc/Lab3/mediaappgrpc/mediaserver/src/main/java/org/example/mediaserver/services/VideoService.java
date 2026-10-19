package org.example.mediaserver.services;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.mediaappgrpc.proto.*;
import org.example.mediaserver.dao.entities.CreatorEntity;
import org.example.mediaserver.dao.entities.VideoEntity;
import org.example.mediaserver.dao.repositories.CreatorRepository;
import org.example.mediaserver.dao.repositories.VideoRepository;
import org.example.mediaserver.mappers.CreatorMapper;
import org.example.mediaserver.mappers.VideoMapper;

import java.util.UUID;

@GrpcService
public class VideoService extends VideoServiceGrpc.VideoServiceImplBase {

    private final VideoRepository videoRepository;
    private final CreatorRepository creatorRepository;
    private final VideoMapper videoMapper;
    private final CreatorMapper creatorMapper;

    public VideoService(VideoRepository videoRepository, CreatorRepository creatorRepository,
                        VideoMapper videoMapper, CreatorMapper creatorMapper) {
        this.videoRepository = videoRepository;
        this.creatorRepository = creatorRepository;
        this.videoMapper = videoMapper;
        this.creatorMapper = creatorMapper;
    }

    @Override
    public void uploadVideo(UploadVideoRequest request, StreamObserver<Video> responseObserver) {
        CreatorEntity creator = creatorMapper.toEntity(request.getCreator());
        if (creator.getId().isEmpty()) {
            creator.setId(UUID.randomUUID().toString());
        }
        creatorRepository.save(creator);

        VideoEntity video = new VideoEntity(
                UUID.randomUUID().toString(),
                request.getTitle(),
                request.getDescription(),
                request.getUrl(),
                request.getDurationSeconds(),
                creator);
        videoRepository.save(video);

        responseObserver.onNext(videoMapper.toGrpc(video));
        responseObserver.onCompleted();
    }

    @Override
    public void getVideo(VideoIdRequest request, StreamObserver<Video> responseObserver) {
        videoRepository.findById(request.getId()).ifPresentOrElse(
                v -> {
                    responseObserver.onNext(videoMapper.toGrpc(v));
                    responseObserver.onCompleted();
                },
                () -> responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Video not found: " + request.getId())
                        .asRuntimeException()));
    }
}