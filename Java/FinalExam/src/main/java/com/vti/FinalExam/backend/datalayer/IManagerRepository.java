//
package com.vti.FinalExam.backend.datalayer;

import java.sql.SQLException;

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
public interface  IManagerRepository {
	void createManager(String firstname, String lastname, int phone, String email, String password, int expInYear) throws Exception;
	public boolean isAccountExists(String email, String password) throws ClassNotFoundException, SQLException;
}
