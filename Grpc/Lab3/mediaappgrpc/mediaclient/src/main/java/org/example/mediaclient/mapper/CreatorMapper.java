package org.example.mediaclient.mapper;

import org.example.mediaappgrpc.proto.Creator;
import org.example.mediaclient.dto.CreatorDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    // Protobuf -> DTO
    public CreatorDto fromGrpc(Creator creator) {
        return modelMapper.map(creator, CreatorDto.class);
    }

    // DTO -> Protobuf
    public Creator toGrpc(CreatorDto dto) {
        return Creator.newBuilder()
                .setId(nullToEmpty(dto.getId()))
                .setName(nullToEmpty(dto.getName()))
                .setEmail(nullToEmpty(dto.getEmail()))
                .build();
    }

    private String nullToEmpty(String s) {
        return s == null ? "" : s;
    }
}