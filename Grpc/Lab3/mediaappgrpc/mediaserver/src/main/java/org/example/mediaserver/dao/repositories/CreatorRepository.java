package org.example.mediaserver.dao.repositories;

import org.example.mediaserver.dao.entities.CreatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<CreatorEntity, String> {
}