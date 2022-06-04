package com.news.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Author 
{
 private long id;
 private String name;
 private Set<Articles> articles;

}
