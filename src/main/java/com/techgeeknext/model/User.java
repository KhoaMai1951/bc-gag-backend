package com.techgeeknext.model;

import java.util.UUID;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
 
@Entity
@Table(name = "users")
public class User {
	@Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;
     
    private String facebookId;
     
    private String username;
    
    private String linkToAvatarImage;

    
	public User(UUID id, String facebookId, String username, String linkToAvatarImage) {
		super();
		this.id = id;
		this.facebookId = facebookId;
		this.username = username;
		this.linkToAvatarImage = linkToAvatarImage;
	}
	
	public User() {
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLinkToAvatarImage() {
		return linkToAvatarImage;
	}

	public void setLinkToAvatarImage(String linkToAvatarImage) {
		this.linkToAvatarImage = linkToAvatarImage;
	}
     
    
}