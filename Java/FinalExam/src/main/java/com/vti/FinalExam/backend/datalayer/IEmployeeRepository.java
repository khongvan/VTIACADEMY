//
package com.vti.FinalExam.backend.datalayer;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.FinalExam.entity.Employee;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.ultis.JdbcUtils;
import com.vti.FinalExam.ultis.properties.MessageProperties;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date:  May 30, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date:  May 30, 2020
 */
public interface  IEmployeeRepository {
	void createEmployee(String firstname, String lastname, int phone, String email, String password, String projectName, String proSkill );
	boolean isAccountExists(String email, String password) throws ClassNotFoundException;
	private JdbcUtils jdbcUtils;
	private MessageProperties messageProperties;

	// create Account
	public void createEmployee(String firstname, String lastname, int phone, String email, String password,
			String projectName, String proSkill) throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "INSERT INTO Account (FirstName, LastName, Phone, Email, Password, projectName, proSkill)"
				+ "VALUE              (   ? ,     ?   	,   ?  ,  ?   ,    ?  ,   ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// set parameter
		preparedStatement.setString(1, firstname);
		preparedStatement.setString(2, lastname);
		preparedStatement.setInt(3, phone);
		preparedStatement.setString(4, email);
		preparedStatement.setString(5, password);
		preparedStatement.setString(6, projectName);
		preparedStatement.setString(7, proSkill);

		// execute query
		int check = preparedStatement.executeUpdate();

		// check create success or false
		System.out.println(check > 0 ? messageProperties.getProperty("employee.insert.complete")
				: messageProperties.getProperty("employee.insert.false"));

		// disconnect
		jdbcUtils.disconnect();
	}
	// login
	// find user for email and password

	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();

		// create statement object
		String sql = "SELECT 1 FROM `Manager` WHERE Email = ? AND Password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, password);

		// execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// handing result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.disconnect();
			return true;
		} else {
			jdbcUtils.disconnect();
			return false;
		}

	}
}
