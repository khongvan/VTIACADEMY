//
package com.vti.FinalExam.entity;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date:  May 29, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date:  May 29, 2020
 */
public class User {
	private String firstName;
	private String lastName;
	private int phone;
	private String email;
	private String password;
	
	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date:  May 29, 2020
	 * @version: 1.0
	 * @modifer: KhongVan
	 * @modifer_date:  May 29, 2020
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param password
	 */
	public User(String firstName, String lastName, int phone, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date:  May 29, 2020
	 * @version: 1.0
	 * @modifer: KhongVan
	 * @modifer_date: 29
	 * @param email
	 * @param password
	 */
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public int getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}


	public String getPassword() {
		return password;
	}

	
	
}
