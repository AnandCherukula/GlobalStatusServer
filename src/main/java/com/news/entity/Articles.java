package com.news.entity;

import java.sql.Timestamp;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;



@Entity
public class Articles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Lob
	private String title;
	
	
	@CreationTimestamp
	private Timestamp publishedAt;
	
	@Lob
	private  String imageUrl;
	
	@Lob
	private  String websiteUrl;
	
	@Lob
	private String description;
	
	@Lob
	private String content;
	
	
	
	@ManyToOne( fetch=FetchType.EAGER, cascade=CascadeType.MERGE)
	private User user;

	
	public Articles() {
		super();
	}

	public Articles(long id, String title, Timestamp publishedAt, String imageUrl, String websiteUrl, String description,
			String content, User user) {
		super();
		this.id = id;
		this.title = title;
		this.publishedAt = publishedAt;
		this.imageUrl = imageUrl;
		this.websiteUrl = websiteUrl;
		this.description = description;
		this.content = content;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Timestamp publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
	
}
