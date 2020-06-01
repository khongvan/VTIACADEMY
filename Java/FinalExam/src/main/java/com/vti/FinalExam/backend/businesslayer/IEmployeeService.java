//
package com.vti.FinalExam.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.entity.Employee;

/**
 * This class is  interface IEmployeeService . 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 30, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date: May 30, 2020
 */
public interface IEmployeeService {
	
	List<Employee> getListEmployees() throws SQLException, IOException, ClassNotFoundException;

	void createEmployee(String firstname, String lastname, int phone, String email,String password, String projectName, String proSkill) throws ClassNotFoundException, SQLException;
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException;
}
