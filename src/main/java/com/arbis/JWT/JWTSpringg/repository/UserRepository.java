package com.arbis.JWT.JWTSpringg.repository;


import com.arbis.JWT.JWTSpringg.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername (String username);
}
