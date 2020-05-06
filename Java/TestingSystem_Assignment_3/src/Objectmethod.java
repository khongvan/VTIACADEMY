
public class Objectmethod {

	public static void main(String[] args) {
		System.out.println("==== Question1 =====");
			Question1();
			
		System.out.println("==== Question2 =====");
			Question2();
			
		System.out.println("==== Question3 =====");
			Question3();
			
		System.out.println("==== Question4 =====");
			Question4();
			
		System.out.println("==== Question5 =====");
			Question5();
			
		System.out.println("==== Question6 =====");
			Question6();
			
		System.out.println("==== Question7 =====");
			Question7();
		
	}
	//Question 1:  In ra thông tin của phòng ban thứ 1 (sử dụng toString()) 
		public static void Question1(){
			Department department1 = new Department();
			department1.setId((byte) 1);
			department1.setName("Sale");
			System.out.println(department1.toString());
		}
	
	//Question 2:  In ra thông tin của tất cả phòng ban (sử dụng toString())
		public static void Question2(){
	        Department department = new Department();
	        department.NhapDS();
	        department.HienDS();
	    }
	
	 //Question 3:  In ra địa chỉ của phòng ban thứ 1  
		public static void Question3(){
	        Department department1 = new Department();
	        department1.setId((byte) 1);
	        department1.setName("Sale");
	        System.out.println(department1.hashCode());

	    }
	 
	 //Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không? 
		public static void Question4(){
	        Department department1 = new Department();
	        department1.setId((byte) 1);
	        department1.setName("Phòng A");
	        if (department1.getName().equals("Phòng A")){
	            System.out.println("Có tên là phòng A");
	        }else {
	            System.out.println("Không tên là phòng A");
	        }

	    }
	 //Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau) 
		public static void Question5(){
	        Department department1 = new Department();
	        department1.setId((byte) 1);
	        department1.setName("Phòng A");

	        Department department2 = new Department();
	        department2.setId((byte) 2);
	        department2.setName("Phòng A");

	        if (department1.equals(department2)){
	            System.out.println("Bằng nhau");
	        }else {
	            System.out.println("Không bằng nhau");
	        }

	    }
	 /*Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD) 
	 * VD:   Ăn gà 
	 * Nơi Nghỉ ngơi 
	 * Phòng Business
	 *  Phòng Sale 
	 *  Uống nước   
	 */
		public static void Question6(){
	        Department department = new Department();
	        department.NhapDS();
	        System.out.println("Danh sách Department vừa nhập");
	        department.HienDS();
	        department.sortASC();
	        System.out.println("Mảng sau khi sắp xếp: ");
	        department.HienDS();
	    }
	 
	/* Question 7: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh 
	 * sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD) 
	*/
		public static void Question7(){
	        Department department = new Department();
	        department.NhapDS();
	        System.out.println("Danh sách Department vừa nhập");
	        department.HienDS();
	        department.sortASC();
	        System.out.println("Mảng sau khi sắp xếp: ");
	        department.HienDS();
	    }
	 
	/*Question 8: in ra danh sách học sinh được sắp xếp theo tên 
	 * VD: Nguyễn Văn A 
	 * Trần Hưng Đạo 
	 * Trần Văn Nam 
	 * Nguyễn Văn Toàn 
	*/

}
