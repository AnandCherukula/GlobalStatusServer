package com.news.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.news.entity.Articles;

public interface ArticlesDao extends JpaRepository<Articles, Long>{

}
