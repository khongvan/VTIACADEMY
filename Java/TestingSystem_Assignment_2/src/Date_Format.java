import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Date_Format {
	@SuppressWarnings("deprecation")
	public static void main(String []args) {
		
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
		
		//Question 1: In ra thông tin account thứ 1 và property create date sẽ được format theo định dạng vietnamese 
		 	System.out.println(account1.createDate);
		 	Locale lc = new Locale("vi","VN");
		 	DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,lc); 
		 	String date = dateformat.format(account1.createDate);
		 	System.out.println(date);
		//Question 2: In ra thông tin: account đã tham gia vào group ngày nào theo định dạng  Năm – tháng – ngày – giờ – phút – giây 
		 	System.out.println("*******************************");
		 	System.out.println(group1.creator.createDate);
		 	String patternt = "yyyy-MM-dd HH:mm:ss";
		 	SimpleDateFormat simpleDateFormat = new SimpleDateFormat (patternt);
			String NgayTG = simpleDateFormat.format(account1.createDate);
		 	System.out.println(NgayTG);
		 	
		//Question 3: Chỉ in ra ngày của create date trong Question 1 
		 	System.out.println("*******************************");
		 	System.out.println(account1.createDate);
		 	String pattern = "dd";
		 	SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat (pattern);
			String dates = simpleDateFormat1.format(account1.createDate);
		 	System.out.println(dates);
		 	
		//Question 4: Chỉ in ra năm của join date trong Question 2 
		 	System.out.println("*******************************");
		 	System.out.println(group1.creator.createDate);
		 	String patterns = "yyyy";
		 	SimpleDateFormat simpleDateFormat11 = new SimpleDateFormat (patterns);
		 	String NamTG = simpleDateFormat11.format(account1.createDate);
		 	System.out.println(NamTG);
		 	
		//Question 5: Chỉ in ra tháng và năm của join date trong Question 2 
		 	System.out.println("*******************************");
		 	System.out.println(group1.creator.createDate);
		 	String mm = "MM";
		 	SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat (mm);
		 	String ThangTG = simpleDateFormat2.format(account1.createDate);
		 	System.out.println(ThangTG);
		//Question 6: Chỉ in ra "MM-DD" của join date trong Question 2 
		 	System.out.println("*******************************");
		 	System.out.println(group1.creator.createDate);
		 	String md = "MM-dd";
		 	SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat (md);
		 	String NTTG = simpleDateFormat3.format(account1.createDate);
		 	System.out.println(NTTG);
		
	}
}
