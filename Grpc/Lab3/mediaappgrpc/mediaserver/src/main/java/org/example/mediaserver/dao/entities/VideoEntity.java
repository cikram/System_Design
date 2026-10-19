package org.example.mediaserver.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoEntity {
    @Id
    private String id;
    private String title;
    private String description;
    private String url;
    private int durationSeconds;
    @ManyToOne
    private CreatorEntity creator;
}