import java.util.Scanner;

public class Strings {
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
			
		System.out.println("==== Question7 =====");
			Question7();
		
		System.out.println("==== Question8 =====");
			Question8();
		
		System.out.println("==== Question9 =====");
			Question9();
		
		System.out.println("==== Question10 =====");
			Question10();
		
		System.out.println("==== Question12 =====");
			Question12();
	}
	
	//Question 1:   Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng ); 
		public static void Question1(){
			String s;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập xâu kí tự: ");
			s = sc.nextLine();
			System.out.println("Số kí tự: " + s.length());
			sc.close();
		}
	
	//Question 2:  Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1; 
		public static void Question2(){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Nhập kí tự thứ 1: ");
	        String s1 = sc1.nextLine();
	        System.out.println("Nhập kí tự thứ 2: ");
	        String s2 = sc1.nextLine();
	        System.out.println("Sau khi nối chuỗi : "  + s1.concat(s2));
	        sc1.close();
	    }
		
	//Question 3:  Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư viết hoa chữ cái đầu thì viết hoa lên 
		public static void Question3(){
	        String ten;
	        Scanner sc3 = new Scanner(System.in);
	        System.out.println("Nhập tên: ");
	        ten = sc3.nextLine();
	        System.out.println(ten.trim().substring(0,1).toUpperCase() + ten.substring(1));
	        sc3.close();
	    }
		
	 //Question 4:  Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra 
		public static void Question4(){
	        String ten;
	        Scanner sc4 = new Scanner(System.in);
	        System.out.println("Nhập tên: ");
	        ten = sc4.nextLine();
	        ten = ten.trim().toUpperCase();
	        for (int i = 0; i < ten.length(); i++) {
	            System.out.println("Ký tự thứ " + i + " là: " + ten.charAt(i));
	        }
	        sc4.close();
	    }
		
	 //Question 5:  Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ 
		public static void Question5(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập Họ: ");
	        String ho = scanner.nextLine();
	        System.out.println("Nhập Tên: ");
	        String ten = scanner.nextLine();
	        System.out.println("Họ & tên đầy đủ: " + ho.concat(ten));
	        scanner.close();
	    }
	
	 //Question 6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm 
	 /*Question 7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và  chuẩn hóa họ và tên của họ như sau: 
	  * a) Xóa dấu cách ở đầu và cuối của chuỗi người dùng nhập vào 
	  * VD: Nếu người dùng nhập vào "   nguyễn văn nam   " thì sẽ chuẩn hóa thành "nguyễn văn nam"
	  * b) Viết hoa chữ cái mỗi từ của người dùng 
	  * VD: Nếu người dùng nhập vào "   nguyễn văn nam   " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam" 
	  */
		public static void Question7(){
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        String hoten;
	        System.out.println("Nhập họ & tên đầy đủ:");
	        hoten = sc.nextLine();
	        hoten = hoten.trim();
	        hoten = hoten.replaceAll("\\s+"," ");
	        String[] arr = hoten.split(" ");
	        hoten = "";
	        for (String x : arr){
	            hoten = hoten + (x.substring(0, 1).toUpperCase() + x.substring(1));
	            hoten = hoten + " ";
	        }
	        System.out.println("Họ tên sau khi chuẩn hóa là: "+ hoten);
	    }
 
	 //Question 8: In ra tất cả các group có chứa chữ "Java" 
		public static void Question8(){
	        String[] arrGroupName = {"Java core", "Java cơ bản", " Java web"};
	        String[] arrChildGroupName;

	        for (String x: arrGroupName){
	            arrChildGroupName = x.split("\\s");
	            for (String y :arrChildGroupName){
	                if (y.toUpperCase().equals("Java")){
	                    System.out.println(x);
	                }
	            }
	        }
	    }
		
	 //Question 9: In ra tất cả các group "Java" 
		public static void Question9(){
	        String[] arrGroupName = {"Java", "C#", "C++"};

	        for (String x: arrGroupName){
	            if (x.toUpperCase().equals("Java")){
	                System.out.println(x);
	            }
	        }
	    }
		
	/*Question 10:  Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.  
	 * Nếu có xuất ra “OK” ngược lại “KO”.  
	 * Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.  */
		public static void Question10(){
	        Scanner scanner = new Scanner(System.in);
	        String s1,ss, s2;
	        System.out.println("Nhập chuỗi 1");
	        s1= scanner.nextLine();
	        System.out.println("Nhập chuỗi 2");
	        s2= scanner.nextLine();
	        ss="";
	        for (int i=s1.length()-1; i>=0; i--){
	            ss+=s1.substring(i,i+1);
	        }
	        if (s2.equals(ss)){
	            System.out.println("Đây là chuỗi đảo ngược !");
	        }
	        scanner.close();
	    }
		
	 /*Question 12: Reverse String Đảo ngược chuỗi sử dụng vòng lặp */
		public static void Question12(){
	        Scanner sc = new Scanner(System.in);
	        String s1,s2;
	        System.out.println("Nhập chuỗi 1");
	        s1= sc.nextLine();
	        s2="";
	        for (int i=s1.length()-1; i>=0; i--){
	            s2+=s1.charAt(i);
	        }
	        System.out.println(s2);
	        sc.close();

	    }
}
