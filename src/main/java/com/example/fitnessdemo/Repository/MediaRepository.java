package com.example.fitnessdemo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fitnessdemo.Entity.Media;
//import com.example.fitnessplatform.Entity.User;

public interface MediaRepository extends JpaRepository<Media, Long> {
    //List<Media> findByUserOrderByCreatedAtDesc(User user);
}