package org.example.mediaclient.mapper;

import org.example.mediaappgrpc.proto.UploadVideoRequest;
import org.example.mediaappgrpc.proto.Video;
import org.example.mediaclient.dto.UploadVideoDto;
import org.example.mediaclient.dto.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {

    private final ModelMapper modelMapper = new ModelMapper();
    private final CreatorMapper creatorMapper;

    public VideoMapper(CreatorMapper creatorMapper) {
        this.creatorMapper = creatorMapper;
    }

    // Protobuf -> DTO de réponse
    public VideoDto fromVideoProtoTovideoDto(Video video) {
        return modelMapper.map(video, VideoDto.class);
    }

    // DTO d'upload -> requête gRPC
    public UploadVideoRequest toUploadRequest(UploadVideoDto dto) {
        UploadVideoRequest.Builder builder = UploadVideoRequest.newBuilder()
                .setTitle(nullToEmpty(dto.getTitle()))
                .setDescription(nullToEmpty(dto.getDescription()))
                .setUrl(nullToEmpty(dto.getUrl()))
                .setDurationSeconds(dto.getDurationSeconds());
        if (dto.getCreator() != null) {
            builder.setCreator(creatorMapper.toGrpc(dto.getCreator()));
        }
        return builder.build();
    }

    private String nullToEmpty(String s) {
        return s == null ? "" : s;
    }
}