package com.news.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.ArticlesDao;
import com.news.dao.UserDao;
import com.news.entity.Articles;
import com.news.entity.User;

@Service
public class ArticleServices {
	
	@Autowired
	private ArticlesDao articlesDao;
	
	@Autowired
	private UserDao userDao;

	public Articles addArticle(Articles articles) {
		System.out.println(articles.getContent());
		System.out.println(articles.getImageUrl());
		if(articles == null)
			return null;
//		else{
//			Articles articlesObj = new Articles();
//			articlesObj.setContent(articles.getContent());
//			articlesObj.setDescription(articles.getDescription());
//			articlesObj.setImageUrl(articles.getImageUrl());
//			articlesObj.setTitle(articles.getTitle());
//			articlesObj.setUser(userDao.findById(articles.getUser().getId()).get());
			
			
			return articlesDao.save(articles);
//			}
	
		
	}

	@SuppressWarnings("unchecked")
	public List<Articles> getArticle() {
		
		return articlesDao.findAll();
	}
	
	@SuppressWarnings("unchecked")
	public List<Articles> getArticle(long id) {
		
		return articlesDao.findAll();
	}

	public String deleteArticle(long id) {
		
		articlesDao.deleteById(id);
			
		return "Deleted Succesfully";
	}

	
	
	
	
	
	

}
