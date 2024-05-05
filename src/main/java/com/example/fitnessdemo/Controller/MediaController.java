package com.example.fitnessdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Service.MediaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/media")
@CrossOrigin
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @PostMapping("/add")
    public String add(@RequestBody Media media){
        mediaService.saveMedia(media);
        return "New Post is added";
    }

    @GetMapping("/getAll")
    public List<Media> getAllMedias() {
        return mediaService.getAllMedias();
    }
}
