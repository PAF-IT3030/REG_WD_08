package com.example.fitnessdemo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.fitnessdemo.Entity.Media;
@Repository
public interface MediaRepository extends JpaRepository<Media, Integer> {
}