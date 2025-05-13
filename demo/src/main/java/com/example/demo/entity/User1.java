package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class User1 {
	@Column
	private String Name;
	@Id
	private String userName;
	@Column
	private String id;
	@Column
	private String phNum;
	@Column
	private String email;
	@Column
	private String password;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhNum() {
		return phNum;
	}
	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User1(String name, String userName, String id, String phNum, String email, String password) {
		super();
		Name = name;
		this.userName = userName;
		this.id = id;
		this.phNum = phNum;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User1 [Name=" + Name + ", userName=" + userName + ", id=" + id + ", phNum=" + phNum + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	public User1() {}

}
