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
public class Manager extends User {
	private int ExpInYear;

	/**
	 * Constructor for class Manager.
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
	 * @param expInYear
	 */
	public Manager(String firstName, String lastName, int phone, String email, String password, int expInYear) {
		super(firstName, lastName, phone, email, password);
		ExpInYear = expInYear;
	}
	
	public Manager(String email, String password) {
		super(email, password);
	}

	public int getExpInYear() {
		return ExpInYear;
	}
}
