package Contructor;


public class Program1 {

	public static void main(String[] args) {
		Question1a();
		Question1b();
		Question2b();
		Question2a();
		Question2c();
		Question3a();
		Question3b();
		Question3c();
		
		
	}
		
	
	/*Question 1: Tạo constructor cho department:  
	 * a) không có parameters 
	 * b) Có 1 parameter là nameDepartment và default id của Department = 0 
	 * Khởi tạo 1 Object với mỗi constructor ở trên 
	 */
	
	public static void Question1a() {
		System.out.println("===== Question1-a =====");
		Department d = new Department ();
		d.id=1;
		d.name="Sale";
		System.out.println(d.name);
	}

	public static void Question1b() {
		System.out.println("===== Question1-b =====");
		Department d1 = new Department("Trần Văn B");
		System.out.println(d1.id);
	}
	
	/*Question 2: Tạo constructor cho Account:  
	 * a) Không có parameters
	 *  b) Có các parameter là AccountID, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) 
	 * c) Có các parameter là AccountID, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, default createDate = now 
	 * d) Có các parameter là AccountID, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và
	 *  Position của User, createDate 
	 *  Khởi tạo 1 Object với mỗi constructor ở trên zzz
	 */
	public static void Question2a() {
		System.out.println("===== Question2-a =====");
		Account a =new Account ();
		a.id=2;
		a.userName= "khongvan";
		a.email="khongvan@gmail.com";
		System.out.println(a.id);
	}
	
	public static void Question2b() {
		System.out.println("===== Question2-b =====");
		Account a1 =new Account (2,"khongvan@gmail.com", "khongvan", "Khổng", "Vân");
		System.out.println(a1.fullName);
	}
	
	public static void Question2c() {
		Position p =new Position ();
		p.id = 2;
		p.name = "Kế toán";
		System.out.println("===== Question2-c =====");
		Account a2 =new Account (1,"khongvan@gmail.com", "khongvan", "Khổng", "Vân", p);
		System.out.println(a2.createDate);

	}	
	
	/*Question 3: Tạo constructor cho Group:  
	 * a) không có parameters
	 *  b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
	 *  c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null). 
	 * Khởi tạo 1 Object với mỗi constructor ở trên 
	 */
	
	public static void Question3a() {
		Group g = new Group();
		g.id=2;
		g.name="Java";
		System.out.println("===== Question3-a =====");
		System.out.println(g.id);
		
	}
	
	public static void Question3b() {}

	public static void Question3c() {}

}
