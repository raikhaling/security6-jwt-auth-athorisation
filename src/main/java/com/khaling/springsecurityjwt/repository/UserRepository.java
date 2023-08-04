package com.khaling.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.khaling.springsecurityjwt.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
