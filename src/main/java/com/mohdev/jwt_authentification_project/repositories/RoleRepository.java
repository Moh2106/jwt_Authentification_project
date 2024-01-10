package com.mohdev.jwt_authentification_project.repositories;

import com.mohdev.jwt_authentification_project.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
