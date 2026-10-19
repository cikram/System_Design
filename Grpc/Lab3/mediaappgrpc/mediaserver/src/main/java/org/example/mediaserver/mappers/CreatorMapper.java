package org.example.mediaserver.mappers;

import org.example.mediaappgrpc.proto.Creator;
import org.example.mediaserver.dao.entities.CreatorEntity;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {

    public Creator toGrpc(CreatorEntity entity) {
        return Creator.newBuilder()
                .setId(entity.getId())
                .setName(entity.getName() == null ? "" : entity.getName())
                .setEmail(entity.getEmail() == null ? "" : entity.getEmail())
                .build();
    }

    public CreatorEntity toEntity(Creator creator) {
        return new CreatorEntity(creator.getId(), creator.getName(), creator.getEmail());
    }
}