package org.example.mediaclient.controllers;

import org.example.mediaappgrpc.proto.Creator;
import org.example.mediaappgrpc.proto.UploadVideoRequest;
import org.example.mediaclient.dto.UploadVideoDto;
import org.example.mediaclient.dto.VideoDto;
import org.example.mediaclient.mapper.VideoMapper;
import org.example.mediaclient.service.VideoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @Autowired
    private VideoServiceClient videoService;

    @Autowired
    private VideoMapper videoMapper;


    @PostMapping("addVideo")
    public VideoDto uploadVideo() {
        Creator creator = Creator.newBuilder()
                .setName("Ikram")
                .setEmail("ikram@test.com")
                .setId("2")
                .build();

        UploadVideoRequest request = UploadVideoRequest.newBuilder()
                .setTitle("grpc 101")
                .setDescription("The gRPC 101 is an introductory course to master Grpc")
                .setUrl("https://github.com/cikram/gRPC101")
                .setDurationSeconds(380)
                .setCreator(creator)
                .build();

        VideoDto videoDto = videoService.uploadVideo(request);
        System.out.println(videoDto);
        return videoDto;
    }


    @PostMapping("videos")
    public VideoDto uploadVideo(@RequestBody UploadVideoDto dto) {
        return videoService.uploadVideo(videoMapper.toUploadRequest(dto));
    }

    @GetMapping("video/{id}")
    public VideoDto getVideo(@PathVariable String id) {
        return videoService.getVideo(id);
    }
}