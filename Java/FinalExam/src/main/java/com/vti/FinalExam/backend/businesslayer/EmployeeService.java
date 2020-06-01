//
package com.vti.FinalExam.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.backend.datalayer.EmployeeRepository;
import com.vti.FinalExam.entity.Employee;

/**
 * This class is EmployeeService. 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 30, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date: May 30, 2020
 */
public class EmployeeService implements IEmployeeService {
	private EmployeeRepository repository;
	
	public EmployeeService() {
		repository = new EmployeeRepository();
	}

	public void createEmployee(String firstname, String lastname, int phone, String email,String password, String projectName,
			String proSkill) throws ClassNotFoundException, SQLException {
		repository.createEmployee(firstname, lastname, phone, email,password, projectName, proSkill);
	}
	
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException{
		return repository.isAccountExists(email, password);
	}

	/* 
	* @see com.vti.FinalExam.backend.businesslayer.IEmployeeService#getListAccounts()
	*/
	public List<Employee> getListAccounts() throws SQLException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	* @see com.vti.FinalExam.backend.businesslayer.IEmployeeService#createEmployee(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	*/
	public void createEmployee(String firstname, String lastname, int phone, String email, String password,
			String projectName, String proSkill) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	/* 
	* @see com.vti.FinalExam.backend.businesslayer.IEmployeeService#isAccountExists(java.lang.String, java.lang.String)
	*/
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
