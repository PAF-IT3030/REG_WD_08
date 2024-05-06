package com.example.fitnessdemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Repository.MediaRepository;

@Service
public class MediaServiceImpl implements MediaService{

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public Media saveMedia(Media media) {
        return mediaRepository.save(media);
    }

    @Override
    public List<Media> getAllMedias() {
        return mediaRepository.findAll();
    }

    
}
