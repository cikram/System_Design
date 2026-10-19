package org.example.mediaclient.controllers;

import org.example.mediaclient.dto.CreatorDto;
import org.example.mediaclient.dto.VideoDto;
import org.example.mediaclient.service.CreatorServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreatorController {

    @Autowired
    private CreatorServiceClient creatorService;

    @GetMapping("creator/{id}")
    public CreatorDto getCreator(@PathVariable String id) {
        return creatorService.getCreator(id);
    }

    @GetMapping("creator/{id}/videos")
    public List<VideoDto> getCreatorVideos(@PathVariable String id) {
        return creatorService.getCreatorVideos(id);
    }
}