//
package com.vti.FinalExam.ultis.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 29, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date: May 29, 2020
 */
public class DatabaseProperties {
	public static final String RESOURCE_FOLDER_URL = "D:\\VTI Accademy\\BaiTap\\JAVA BASE\\TestingSystem_Assignment_11_Maven\\src\\main\\resources\\";

	private Properties properties;

	public DatabaseProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_FOLDER_URL + "database.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
