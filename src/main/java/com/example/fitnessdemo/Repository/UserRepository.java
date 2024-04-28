package com.example.fitnessdemo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.fitnessdemo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    //User findByUsername(String username);
}
