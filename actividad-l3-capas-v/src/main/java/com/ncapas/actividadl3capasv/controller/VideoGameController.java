package com.ncapas.actividadl3capasv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncapas.Entities.VideoGame;
import com.ncapas.actividadl3capasv.service.iVideoGameService;

@RestController
@RequestMapping("/api/videogames")
public class VideoGameController {

    @Autowired
    private iVideoGameService videoGameService;

    @PostMapping
    public ResponseEntity<VideoGame> createVideoGame(@RequestBody VideoGame videoGame) {
        VideoGame createdVideoGame = videoGameService.createVideoGame(videoGame);
        return ResponseEntity.ok(createdVideoGame);
    }
}
