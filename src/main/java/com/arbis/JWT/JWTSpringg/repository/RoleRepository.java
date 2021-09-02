package com.arbis.JWT.JWTSpringg.repository;


import com.arbis.JWT.JWTSpringg.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
