
public class BoxingUnboxin {
	public static void main(String[] args) {
		System.out.println("***** Question1 *****");
		Question1();
		System.out.println("***** Question2 *****");
		Question2();
		System.out.println("***** Question3 *****");
		Question3();
	}
	/*Question 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
	 *  Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân) */
		public static void Question1(){
			Integer salary = 5000;
			System.out.printf("%2.2f",(float)salary);
    }
	/*Question 2: Khai báo 1 String có value = "1234567" Hãy convert String đó ra số int */
		 public static void Question2(){
		        String s1 = "1234567";
		        Integer a = Integer.parseInt(s1);
		        System.out.println(a);
		    }
	/*Question 3: Khởi tạo 1 số Integer có value là chữ "1234567" Sau đó convert số trên thành datatype int */
		 public static void Question3(){
		        Integer a = 1234567;
		        int b = a.intValue();
		        System.out.println(b);
		    }
}
