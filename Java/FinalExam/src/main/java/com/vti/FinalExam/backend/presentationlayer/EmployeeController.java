//
package com.vti.FinalExam.backend.presentationlayer;

import java.sql.SQLException;

import com.vti.FinalExam.backend.businesslayer.EmployeeService;
import com.vti.FinalExam.backend.businesslayer.IEmployeeService;
import com.vti.FinalExam.entity.Employee;

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
public class EmployeeController {
	private IEmployeeService service;

	public EmployeeController() {
		service = new EmployeeService();
	}

	public void createEmployee(String firstname, String lastname, int phone, String email, String password,
			String projectName, String proSkill) throws Exception {
		service.createEmployee(firstname, lastname, phone, email, password, projectName, proSkill);
		while (true) {
			String phones = String.valueOf(phone);
			String[] arr = password.split("");
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].charAt(0) > 91) {
					count++;
				}
				if (count == arr.length) {
					throw new Exception("password must be have one more capital character");
				}
			}
			if (phones.length() > 12 || phones.length() < 9) {
				throw new Exception("phone must be have 9 character to 12 character");
			}
			if (email.contains("@vti.com.vn")) {
				throw new Exception("email must be contains @vti.com.vn");
			}
			if (projectName != "Testing System" && projectName != "CRM" && projectName != "TimeSheet") {
				throw new Exception("project name is not valid!");
			}
			if (password.length() < 6 || password.length() > 12) {
				throw new Exception("password must have 6 to 12 character");
			}

			service.createEmployee(firstname, lastname, phone, email, password, projectName, proSkill);
		}
	}

	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException {
		return service.isAccountExists(email, password);
	}
}
