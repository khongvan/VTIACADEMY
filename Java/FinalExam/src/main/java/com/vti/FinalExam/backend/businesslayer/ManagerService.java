//
package com.vti.FinalExam.backend.businesslayer;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.backend.datalayer.ManagerRepository;


/**
 * This class is  ManagerService. 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date:  May 30, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date:  May 30, 2020
 */
public class ManagerService implements IManagerService{
	private ManagerRepository repository;

	public ManagerService() {
		repository = new ManagerRepository();
	}

	public void createManager(String firstname, String lastname, int phone, String email, String password, int expInYear)
			throws ClassNotFoundException, SQLException {
		 repository.createManager(firstname, lastname, phone, email, password, expInYear);
	} 
	
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException{
		return repository.isAccountExists(email, password);
	}
}
