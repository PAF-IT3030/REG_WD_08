package com.example.fitnessdemo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.fitnessdemo.Entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    
    
}