package com.news.service;

import com.news.dao.RoleDao;
import com.news.entity.Role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }

	public List<Role> getRoles() {
		
		return (List<Role>) roleDao.findAll();
	}
}
