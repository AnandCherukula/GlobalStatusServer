package com.news.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.news.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

	User findByUserName(String userName);
}
