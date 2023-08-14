package com.khaling.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.khaling.springsecurityjwt.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //When you call the findByEmail method with an email parameter,
    // Spring Data JPA will create and execute a query to retrieve the user with the specified email.
    Optional<User> findByEmail(String email);
}
