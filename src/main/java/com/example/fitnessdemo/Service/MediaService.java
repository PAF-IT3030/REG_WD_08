package com.example.fitnessdemo.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Repository.MediaRepository;

@Service
public class MediaService {

    private final MediaRepository mediaRepository;

    @Autowired
    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public List<Media> findAll() {
        return mediaRepository.findAll();
    }

    public Optional<Media> findById(int id) {
        return mediaRepository.findById(id);
    }

    public Media save(Media media) {
        return mediaRepository.save(media);
    }

    public void deleteById(int id) {
        mediaRepository.deleteById(id);
    }
}
