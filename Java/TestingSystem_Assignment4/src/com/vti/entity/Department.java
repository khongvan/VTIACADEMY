package com.vti.entity;

public class Department {
	private int id;
	private String name;
	
	//a) không có parameters 
	public Department(){}
	
	//b) Có 1 parameter là nameDepartment và default id của Department = 0 
	public Department(String name){
		this.name= name;
		this.id=0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
