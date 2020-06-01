//
package com.vti.FinalExam.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.entity.Employee;
import com.vti.FinalExam.entity.Manager;

/**
 * This class is interface  IManagerService . 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 30, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date: May 30, 2020
 */
public interface  IManagerService {
	List<Manager> getListManagers() throws SQLException, IOException, ClassNotFoundException;
	void createManager(String firstname, String lastname, int phone, String email,String password, int expInYear) throws ClassNotFoundException, SQLException;
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException;
}
