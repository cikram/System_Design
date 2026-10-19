package org.example.mediaclient.service;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.mediaappgrpc.proto.Creator;
import org.example.mediaappgrpc.proto.CreatorIdRequest;
import org.example.mediaappgrpc.proto.CreatorServiceGrpc;
import org.example.mediaappgrpc.proto.VideoStream;
import org.example.mediaclient.dto.CreatorDto;
import org.example.mediaclient.dto.VideoDto;
import org.example.mediaclient.mapper.CreatorMapper;
import org.example.mediaclient.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatorServiceClient {

    @GrpcClient("mediaserver")
    CreatorServiceGrpc.CreatorServiceBlockingStub stub;

    @Autowired
    private CreatorMapper creatorMapper;

    @Autowired
    private VideoMapper videoMapper;

    public CreatorDto getCreator(String id) {
        Creator creator = stub.getCreator(CreatorIdRequest.newBuilder().setId(id).build());
        return creatorMapper.fromGrpc(creator);
    }

    public List<VideoDto> getCreatorVideos(String id) {
        VideoStream stream = stub.getCreatorVideos(CreatorIdRequest.newBuilder().setId(id).build());
        return stream.getVideosList().stream()
                .map(videoMapper::fromVideoProtoTovideoDto)
                .toList();
    }
}