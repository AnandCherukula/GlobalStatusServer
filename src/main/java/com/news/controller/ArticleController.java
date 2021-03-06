package com.news.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.news.entity.Articles;
import com.news.service.ArticleServices;

@RestController
@RequestMapping("/articles")
public class ArticleController {
	
	
	@Autowired
	private ArticleServices articleServices;
	
	/*
	 * Copyright 2022 the original author or authors.
	 *
	 * Licensed under the Apache License, Version 2.0 (the "License");
	 * you may not use this file except in compliance with the License.
	 * You may obtain a copy of the License at
	 *
	 *      http://www.apache.org/licenses/LICENSE-2.0
	 *
	 * Unless required by applicable law or agreed to in writing, software
	 * distributed under the License is distributed on an "AS IS" BASIS,
	 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	 * See the License for the specific language governing permissions and
	 * limitations under the License.
	 */

	
	
	
	@PostMapping("/addArticle")
	@PreAuthorize("hasRole('Admin') OR hasRole('Reporter')  OR hasRole('Super_Admin')")
	public Articles addArticles(@RequestBody Articles articles) {
		
		return articleServices.addArticle( articles);
		
	}
	
	@GetMapping("/getArticle")
	public List<Articles> getArticles() {
		
		return articleServices.getArticle();
		
	}
	
	@GetMapping("/getArticle/{id}")
	public List<Articles> getArticles(@PathVariable long id) {
		
		return articleServices.getArticle(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteArticles(@PathVariable long id) {
		
		return articleServices.deleteArticle(id);
		
	}
	@PutMapping("/update/")
	public Articles updateArticles(@RequestBody Articles articles) {
		
		return articleServices.addArticle(articles);
		
	}
	
	
	
	
	

}
