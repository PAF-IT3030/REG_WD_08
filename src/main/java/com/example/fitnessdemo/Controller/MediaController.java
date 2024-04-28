package com.example.fitnessdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Service.MediaService;
import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @GetMapping
    public List<Media> getAllMedia() {
        return mediaService.getAllMedia();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Media> getMediaById(@PathVariable Long id) {
        Media media = mediaService.getMediaById(id);
        return ResponseEntity.ok().body(media);
    }

    @PostMapping("/upload")
    public ResponseEntity<Media> uploadMedia(@RequestParam("file") MultipartFile file,
                                             @RequestParam("description") String description) {
        // Implement logic for media upload
        // Call mediaService to handle media upload
        Media media = new Media();
        media.setDescription(description);
        // Set other media properties as needed
        // You can save the file to storage and generate a URL, then set it to media object
        // For simplicity, I'll assume you set the file URL directly to media object
        media.setFileUrl("https://example.com/media/" + file.getOriginalFilename()); 
        mediaService.uploadMedia(media);
        return ResponseEntity.ok().body(media);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Media> updateMedia(@PathVariable Long id, @RequestBody Media mediaDetails) {
        final Media updatedMedia = mediaService.updateMedia(id, mediaDetails);
        return ResponseEntity.ok(updatedMedia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMedia(@PathVariable Long id) {
        mediaService.deleteMedia(id);
        return ResponseEntity.ok().build();
    }
}
