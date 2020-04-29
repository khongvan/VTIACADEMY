import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Flow_Control {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		
		// create Department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketting";
	
		// create Position
		Position position1 = new Position();
		position1.id =1;
		position1.name = "Thực tập sinh";
		
		Position position2 = new Position();
		position2.id =3;
		position2.name = "Kế toán";
		
		Position position3 = new Position();
		position3.id =3;
		position3.name = "CEO";
		
		//create Account
		Account account1 = new Account ();
		account1.id =1;
		account1.email = "Khongvan@gmail.com";
		account1.userName="Khongvan";
		account1.fullName = "Khổng Thị Vân";
		account1.deparment = department1;
		account1.position = position1;
		account1.createDate= new Date ("2020/04/22");
		
		Account account2 = new Account ();
		account2.id =2;
		account2.email = "Tranduy@gmail.com";
		account2.userName="Tranduy";
		account2.fullName = "Tran Van Duy";
		account2.deparment = department1;
		account2.position = position1;
		account2.createDate= new Date ("2020/04/22");
		
		Account account3 = new Account ();
		account3.id =2;
		account3.email = "Tranduy@gmail.com";
		account3.userName="Tranduy";
		account3.fullName = "Tran Van Duy";
		account3.deparment = department1;
		account3.position = position1;
		account3.createDate= new Date ("2020/04/22");
		
		
		// create Group
		Group group1 = new Group();
		group1.id =1;
		group1.name = "Java Fresher" ;
		group1.creator = account1;
		group1.createDate= new Date ("2020/04/18");
		
		
		Group group2 = new Group();
		group2.id =2;
		group2.name = "C# Fresher" ;
		group2.creator = account2;
		group2.createDate=new Date ("2020/04/19");
		
		Group group3 = new Group();
		group3.id =3;
		group3.name = "C# Fresher" ;
		group3.creator = account3;
		group3.createDate=new Date ("2020/04/22");
		
		Account[] AccountOfDepartment1 = { account1,account2, account3};
		department1.employees = AccountOfDepartment1;
		
		Account[] AccountOfDepartment2 = { account1,account2};
		department2.employees = AccountOfDepartment2;
		
		Group [] GroupOfAccount1 = {group1, group2};
		account1.groups = GroupOfAccount1;
		
		Group [] GroupOfAccount2 = {group1, group3};
		account2.groups = GroupOfAccount2;
		
		Group [] GroupOfAccount3 = {group1, group2,group3};
		account3.groups = GroupOfAccount3;
		
		Account[] AccountOfGroup1 = {account1, account2, account3};
		group1.participants = AccountOfGroup1;
		
		Account[] AccountOfGroup2 = {account1,account3};
		group2.participants = AccountOfGroup2;
		
		Account[] AccountOfGroup3 = {account1, account2};
		group3.participants = AccountOfGroup3;
		  
		
		System.out.println("********* IF *******");
		/*Question 1:  Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban" 
		 
		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …" */
		
		if (account2.deparment == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}
		else {
			System.out.println("Phòng ban của nhân viên này là:" + account2.deparment.name);
		}
		 
		/*Question 2:  Kiểm tra account thứ 2,  Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group" 
		 
		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher" 
		 
		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group" 
		 
		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group*/
		
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		}
		else if (account2.groups.length ==1 || account2.groups.length ==2) {
			for (Group groups :GroupOfAccount2 ) {
				System.out.println(groups.name);
			}
		}
		else if (account2.groups.length ==3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}
		else if (account2.groups.length ==4) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		
		// Question 3: Sử dụng toán tử ternary để làm Question 1
		System.out.println(account2.deparment == null ? "Nhân viên này chưa có phòng ban" :"Phòng ban của nhân viên này là:" + account2.deparment.name );
	
		/*Question 4: Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của account thứ 1 Nếu Position = Dev thì in ra text "Đây là Developer" 
		 Nếu không phải thì in ra text  */
		
		System.out.println(account1.position.name == "Dev" ? "Đây là Developer" :"Người này không phải là Developer");
		System.out.println("\n");
		System.out.println("***** SWITCH CASE *****");
		
		/*Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau: 
		 * Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" 
		 * Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên" 
		 * Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên" 
		 * Còn lại in ra "Nhóm có nhiều thành viên" 
		 */
		
		int x =2;
		switch(x){
		case 1: 
			System.out.println("Nhóm có một thành viên");
			break;
		case  2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case  3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default :
			System.out.println("Nhóm có nhiều thành viên");
		}
		// Question 6: Sử dụng switch case để làm lại Question 2 
			int ac2 = 3;
			switch(ac2){
			case 1: 
				System.out.println("Nhân viên này chưa có group");
				break;
			case  2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case  3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default :
				System.out.println("\"Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		
		}
			System.out.println("***** FOREACH *****");
			//Question 9: in ra thông tin các phòng ban bao gồm: id và name
				System.out.println("Thông tin các phòng ban");
				Map<Integer, String> hmap = new HashMap<Integer, String>();
		        hmap.put(1, "Sale");
		        hmap.put(2, "Marketing");
		        hmap.put(3, "PHP");
		        hmap.put(4, "C#");
		        hmap.put(5, "C++");
		
		        hmap.forEach((key, value) -> System.out.println(key + " - " + value));
			   
			
			System.out.println("***** FOR *****");
			//Question 14: in ra thông tin tất cả các account có id < 4 
				System.out.println("Thông tin tất cả các account có id < 4 là:");
				for (int i =1; i<4;i++) {
					System.out.println(i);
				}
			//Question 15: in ra các số chẵn nhỏ hơn hoặc bằng 20 
				System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20 là:");
				for (int i=1; i <=20;i++) {
					if(i%2 ==0)
					System.out.println(i);
				}
			
			System.out.println("***** WHILE *****");
			// Question 16: in ra các số chẵn nhỏ hơn hoặc bằng 20 
				System.out.println("Các số chẵn nhỏ hơn hoặc bằng 20 là:");
				int i = 1;
				while (i <= 20) {
					if(i%2 ==0)
					System.out.println(i);
					i++;
				}

			System.out.println("***** DO - WHILE *****");
	}
}
