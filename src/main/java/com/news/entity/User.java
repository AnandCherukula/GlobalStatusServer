package com.news.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String userName;
    private String userFirstName;
    private String userLastName;
    @JsonIgnore
    private String userPassword;
    
   
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role;

    @JsonIgnore
    @OneToMany(mappedBy="user", targetEntity=Articles.class)
//    @JoinColumn(name="user_id", referencedColumnName="id")
    private Set<Articles> articles;
    
    
    
    
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
    
	public Set<Articles> getArticles() {
		return articles;
	}

	public void setArticles(Set<Articles> articles) {
		this.articles = articles;
	}
}
