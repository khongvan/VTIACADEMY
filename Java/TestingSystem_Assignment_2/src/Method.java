

public class Method {
	public static void main (String[] args) {
		Sochan();
		TTaccount();
		Songuyenduong (10);
	}
	//Question 1: Tạo method để in ra các số chẵn 
	public static void Sochan() {
		int n = 8;
		System.out.println(n % 2 == 0 ? " Số chẵn" : "Số lẻ");
	}
	
	//Question 2: Tạo method để in thông tin các account 
	public static void TTaccount () {
		System.out.println("********************");
		System.out.println("Thông tin Account");
		System.out.println("id: 1");
		System.out.println("Họ tên: Khổng Thị Vân");
		System.out.println("Email: khongvan98nd@gmail.com");
		System.out.println("Phòng ban: 1");
		System.out.println("Chức vụ: Thực tập sinh");
	}
	//Question 3: Tạo method để in ra các số nguyên dương nhỏ hơn 10 
	public static void Songuyenduong (int  n) {
		for (int i=0; i< n; i++)
		{
			System.out.println(i);
		}
		
	}
}
