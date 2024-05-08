/* package com.example.fitnessdemo.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Media getMediaById(int id) {
        Optional<Media> media = mediaRepository.findById(id);
        return media.orElse(null);
    }

    @Override
    public Media updateMedia(int id, Media updatedMedia) {
        Optional<Media> optionalMedia = mediaRepository.findById(id);
        if (optionalMedia.isPresent()) {
            Media existingMedia = optionalMedia.get();
            existingMedia.setDescription(updatedMedia.getDescription());
            existingMedia.setFileUrl(updatedMedia.getFileUrl());
            return mediaRepository.save(existingMedia);
        }
        return null;
    }

    @Override
    public void deleteMedia(int id) {
        mediaRepository.deleteById(id);
    }

    

    
}
 */