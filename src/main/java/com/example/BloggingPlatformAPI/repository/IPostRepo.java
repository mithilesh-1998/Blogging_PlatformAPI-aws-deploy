package com.example.BloggingPlatformAPI.repository;

import com.example.BloggingPlatformAPI.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
}
