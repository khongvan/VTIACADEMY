package com.vti.entity;

import java.util.Date;

public class Account {
	private int		id;
	private String	email;
	private String	userName;
	private String	 fullName;
	private Department	deparment;
	private Date	createDate;
	private Position	position;
	private Group[] groups;
	
	public Account(){}
	
	public Account(int id, String email, String userName, String firstName, String lastName){
		this.id=id;
		this.email=email;
		this.userName = userName;
		this.fullName= firstName + lastName;
	}
	
	public Account(int id, String email, String userName, String firstName, String lastName,Position position){
		this.id=id;
		this.email=email;
		this.userName = userName;
		this.fullName= firstName + lastName;
		this.position= position;
		this.createDate = new Date();
		}
	
	public Account (String userName){
		this.userName =userName;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDeparment() {
		return deparment;
	}

	public void setDeparment(Department deparment) {
		this.deparment = deparment;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	
}
