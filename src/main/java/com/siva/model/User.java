package com.siva.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String userPwd;
	private String userGen;
	private String userCours;
	private String userAddr;
	@ElementCollection
	private List<String> userLang;

}
