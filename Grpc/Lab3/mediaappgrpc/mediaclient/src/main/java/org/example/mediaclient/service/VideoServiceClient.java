package org.example.mediaclient.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.mediaappgrpc.proto.UploadVideoRequest;
import org.example.mediaappgrpc.proto.Video;
import org.example.mediaappgrpc.proto.VideoIdRequest;
import org.example.mediaappgrpc.proto.VideoServiceGrpc;
import org.example.mediaclient.dto.VideoDto;
import org.example.mediaclient.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceClient {

    @GrpcClient("mediaserver")
    VideoServiceGrpc.VideoServiceBlockingStub stub;

    @Autowired
    private VideoMapper mapper;

    public VideoDto uploadVideo(UploadVideoRequest videoRequest) {
        Video video = stub.uploadVideo(videoRequest);
        return mapper.fromVideoProtoTovideoDto(video);
    }

    public VideoDto getVideo(String id) {
        Video video = stub.getVideo(VideoIdRequest.newBuilder().setId(id).build());
        return mapper.fromVideoProtoTovideoDto(video);
    }
}