package Contructor;

import java.util.Date;

public class Account {
	int		id;
	String	email;
	String	userName;
	String	 fullName;
	Department	deparment;
	Date	createDate;
	Position	position;
	Group[] groups;
	
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
}
