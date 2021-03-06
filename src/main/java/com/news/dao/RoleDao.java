package com.news.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.news.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Integer> {

}
