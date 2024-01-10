package com.mohdev.jwt_authentification_project.controller;

import com.mohdev.jwt_authentification_project.entities.Role;
import com.mohdev.jwt_authentification_project.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("/roles")
    public Role createNewRole(@RequestBody Role role){
        return roleService.createRole(role);
    }

    @GetMapping("/roles")
    public List<Role> allRoles(){
        return roleService.findAllRole();
    }
}
