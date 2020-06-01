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
public class MessagerProperties {
	private Properties properties;

	public void MessageProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(DatabaseProperties.RESOURCE_FOLDER_URL + "message.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
