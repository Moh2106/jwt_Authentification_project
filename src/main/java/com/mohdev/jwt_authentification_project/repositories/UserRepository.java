package com.mohdev.jwt_authentification_project.repositories;

import com.mohdev.jwt_authentification_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
