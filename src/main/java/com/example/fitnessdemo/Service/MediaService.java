package com.example.fitnessdemo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Repository.MediaRepository;

@Service
public class MediaService {
    @Autowired
    private MediaRepository mediaRepository;

    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    public Media getMediaById(Long id) {
        return mediaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Media not found with id: " + id));
    }

    public Media uploadMedia(Media media) {
        // Implement logic for media upload (e.g., saving to storage, generating URL)
        return mediaRepository.save(media);
    }

    public Media updateMedia(Long id, Media mediaDetails) {
        Media media = mediaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Media not found with id: " + id));

        media.setDescription(mediaDetails.getDescription());
        // Set other media details as needed

        return mediaRepository.save(media);
    }

    public void deleteMedia(Long id) {
        Media media = mediaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Media not found with id: " + id));
        mediaRepository.delete(media);
    }
}
