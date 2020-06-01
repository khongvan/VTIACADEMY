//
package com.vti.FinalExam.frontend;

import java.sql.SQLException;

import com.vti.FinalExam.backend.presentationlayer.EmployeeController;
import com.vti.FinalExam.backend.presentationlayer.ManagerController;
import com.vti.FinalExam.entity.Employee;
import com.vti.FinalExam.ultis.ScannerUtils;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NNDuy
 * @create_date: May 31, 2020
 * @version: 1.0
 * @modifer: KhongVan
 * @modifer_date: May 31, 2020
 */
public class program {
	private static ManagerController managerController;
	private static EmployeeController employeeController;
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: KhongVan
	 * @modifer_date: May 31, 2020
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int luachon;
		do {
			menuAccount();
			luachon=ScannerUtils.inputInt("===== Mời bạn nhập số ======");
			switch (luachon) {
			case 1:
				System.out.println("===== Đăng kí  Manager =====");
				TaoManager();
				break;
			case 2:
				System.out.println("===== Đăng kí  Employee =====");
				TaoEmployee();
				break;
			case 3:
				System.out.println("===== Đăng nhập Managerr =====");
				ManagerLogin();
				break;
			case 4:
				System.out.println("===== Đăng nhập Employee =====");
				EmployeeLogin();
				break;
			default:
				System.out.println("Nhập sai! Vui lòng nhập lại.");
				break;
			}
			
		}while(luachon != 5);
	}
	
	private static void menuAccount() {
		System.out.println("=============MENU============");
		System.out.println("=|1. 	Đăng kí  Manager   |=");
		System.out.println("=|2. 	Đăng kí  Employee  |=");
		System.out.println("=|3. 	Đăng nhập Manager  |=");
		System.out.println("=|4. 	Đăng nhập Employee |=");
		System.out.println("=|5. 	Thoát              |=");
		System.out.println("=============================");
		System.out.println("Lựa chọn của bạn:           =");
	}
	
	/**
	 * This method is used for TaoManager. 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: KhongVan
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */

	
	private static void TaoManager() throws Exception {

		System.out.println("Input firstname: ");
		String firstname = ScannerUtils.inputString("Please input firstname as String!");

		System.out.println("Input lastname: ");
		String lastname = ScannerUtils.inputString("Please input lastname as String!");

		System.out.println("Input phone: ");
		int phone = ScannerUtils.inputInt("Please input phone as int!");

		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input email as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input password as String!");

		System.out.println("Input expInYear: ");
		int expInYear = ScannerUtils.inputInt("Please input phone as int!");

		managerController.createManager(firstname, lastname, phone, email, password, expInYear);
	}
	
	/**
	 * This method is used for TaoEmployee. 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: KhongVan
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	
	private static void TaoEmployee() throws Exception {
		System.out.println("Input firstname: ");
		String firstname = ScannerUtils.inputString("Please input email as String!");

		System.out.println("Input lastname: ");
		String lastname = ScannerUtils.inputString("Please input username as String!");

		System.out.println("Input phone: ");
		int phone = ScannerUtils.inputInt("Please input phone as int!");

		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input email as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input password as String!");

		System.out.println("Input projectName: ");
		int projectName = ScannerUtils.inputInt("Please input projectName  as String!");
		
		System.out.println("Input ProSkill: ");
		int ProSkill = ScannerUtils.inputInt("Please input ProSkill  as String!");

		managerController.createEmployee(firstname, lastname, phone, email, password, projectName,ProSkill);
	}
	
	/**
	 * This method is used for ManagerLogin. 
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: KhongVan
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public static void ManagerLogin() throws ClassNotFoundException, SQLException {
		System.out.println("Input full email: ");
		String email = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input full password: ");
		String password = ScannerUtils.inputString("Please input full name as String!");
	}
		
		/**
		 * This method is used for EmployessLogin. 
		 * 
		 * @Description: .
		 * @author: NNDuy
		 * @create_date: May 31, 2020
		 * @version: 1.0
		 * @modifer: KhongVan
		 * @modifer_date: May 31, 2020
		 * @throws Exception
		 */
		
		public static void EmployeeLogin() throws ClassNotFoundException, SQLException {
			
		}
	
}



	