package com.example.fitnessdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Service.MediaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/api/media")

public class MediaController {

    private MediaService mediaService;

   @Autowired
    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    @GetMapping
    public ResponseEntity<List<Media>> getAllMedias() {
        List<Media> medias = mediaService.findAll();
        return new ResponseEntity<>(medias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Media> getMediaById(@PathVariable int id) {
        return mediaService.findById(id)
                .map(media -> new ResponseEntity<>(media, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Media> createMedia(@RequestBody Media media) {
        Media newMedia = mediaService.save(media);
        return new ResponseEntity<>(newMedia, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Media> updateMedia(@PathVariable int id, @RequestBody Media media) {
        return mediaService.findById(id)
                .map(existingMedia -> {
                    existingMedia.setDescription(media.getDescription());
                    Media updatedMedia = mediaService.save(existingMedia);
                    return new ResponseEntity<>(updatedMedia, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedia(@PathVariable int id) {
        mediaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
