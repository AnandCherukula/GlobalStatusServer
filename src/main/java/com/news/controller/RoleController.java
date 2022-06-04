package com.news.controller;

import com.news.entity.Role;
import com.news.service.RoleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping({"/createNewRole"})
    @PreAuthorize("hasRole('Admin')")
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
    @GetMapping({"/getRoles"})
    @PreAuthorize("hasRole('Admin') or hasRole('Super Admin')")
    public List<Role> getRoles() {
        return roleService.getRoles();
    }
}

