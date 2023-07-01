package com.healthcare.backend_health.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.healthcare.backend_health.entity.AuthUser;

public interface UserRepository extends JpaRepository<AuthUser, Long> {

    Optional<AuthUser> findByUsername(String username);

}
