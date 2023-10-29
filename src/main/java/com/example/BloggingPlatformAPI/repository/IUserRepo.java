package com.example.BloggingPlatformAPI.repository;

import com.example.BloggingPlatformAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {

    User findFirstByUserEmail(String newEmail);
}
