package org.example.mediaserver.mappers;

import org.example.mediaappgrpc.proto.Video;
import org.example.mediaserver.dao.entities.VideoEntity;
import org.springframework.stereotype.Component;

@Component
public class VideoMapper {

    private final CreatorMapper creatorMapper;

    public VideoMapper(CreatorMapper creatorMapper) {
        this.creatorMapper = creatorMapper;
    }

    public Video toGrpc(VideoEntity entity) {
        Video.Builder builder = Video.newBuilder()
                .setId(entity.getId())
                .setTitle(entity.getTitle() == null ? "" : entity.getTitle())
                .setDescription(entity.getDescription() == null ? "" : entity.getDescription())
                .setUrl(entity.getUrl() == null ? "" : entity.getUrl())
                .setDurationSeconds(entity.getDurationSeconds());

        if (entity.getCreator() != null) {
            builder.setCreator(creatorMapper.toGrpc(entity.getCreator()));
        }
        return builder.build();
    }
}