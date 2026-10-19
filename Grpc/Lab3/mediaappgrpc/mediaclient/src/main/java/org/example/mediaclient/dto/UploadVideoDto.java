package org.example.mediaclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UploadVideoDto {
    private String title;
    private String description;
    private String url;
    private int durationSeconds;
    private CreatorDto creator;
}