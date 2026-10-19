package org.example.mediaserver.dao.repositories;

import org.example.mediaserver.dao.entities.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VideoRepository extends JpaRepository<VideoEntity, String> {
    List<VideoEntity> findByCreatorId(String creatorId);
}