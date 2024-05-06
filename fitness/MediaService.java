package com.example.fitnessdemo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fitnessdemo.Entity.Media;
import com.example.fitnessdemo.Repository.MediaRepository;

@Service
public interface MediaService {

    public Media saveMedia(Media media);

    public List<Media> getAllMedias();
}
