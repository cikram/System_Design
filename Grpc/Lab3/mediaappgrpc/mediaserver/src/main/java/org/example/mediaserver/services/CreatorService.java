package org.example.mediaserver.services;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.mediaappgrpc.proto.*;
import org.example.mediaserver.dao.repositories.CreatorRepository;
import org.example.mediaserver.dao.repositories.VideoRepository;
import org.example.mediaserver.mappers.CreatorMapper;
import org.example.mediaserver.mappers.VideoMapper;

@GrpcService
public class CreatorService extends CreatorServiceGrpc.CreatorServiceImplBase {

    private final CreatorRepository creatorRepository;
    private final VideoRepository videoRepository;
    private final CreatorMapper creatorMapper;
    private final VideoMapper videoMapper;

    public CreatorService(CreatorRepository creatorRepository, VideoRepository videoRepository,
                          CreatorMapper creatorMapper, VideoMapper videoMapper) {
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
        this.creatorMapper = creatorMapper;
        this.videoMapper = videoMapper;
    }

    @Override
    public void getCreator(CreatorIdRequest request, StreamObserver<Creator> responseObserver) {
        creatorRepository.findById(request.getId()).ifPresentOrElse(
                c -> {
                    responseObserver.onNext(creatorMapper.toGrpc(c));
                    responseObserver.onCompleted();
                },
                () -> responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Creator not found: " + request.getId())
                        .asRuntimeException()));
    }

    @Override
    public void getCreatorVideos(CreatorIdRequest request, StreamObserver<VideoStream> responseObserver) {
        VideoStream.Builder stream = VideoStream.newBuilder();
        videoRepository.findByCreatorId(request.getId())
                .forEach(v -> stream.addVideos(videoMapper.toGrpc(v)));
        responseObserver.onNext(stream.build());
        responseObserver.onCompleted();
    }
}