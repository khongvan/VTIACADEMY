import java.util.Calendar;

public class System_out_printf {
	public static void main (String[] args) {
				
		//Question 1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó 
			System.out.printf("%d %n",5);	 
		//Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó thành định dạng như sau: 100,000,000 
			System.out.printf("%,d %n", 100000000);	 
		//Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau 
			System.out.printf("%.4f %n", 5.567098);
		//Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau: Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:  Tên tôi là "Nguyễn Văn A" và tôi đang độc thân. 
			System.out.printf("Tên tôi là: '%s' và tôi đang độc thân \n","Nguyễn Văn A"); 
		//Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s  
			  Calendar cal = Calendar.getInstance();
		        cal.set(2020, 04, 24,11,16,20);
		 
		        // Format the month.
		        System.out.printf("Month: %1$tB  \n", cal);
		 
		        // Format the day.
		        System.out.printf("Day: %1$tA  \n", cal);
		 
		        // Format the year.
		        System.out.printf("Year: %1$tY  \n", cal);
		         
		        // Format the hour.
		        System.out.printf("Hour: %1$tH  \n", cal);
		 
		        // Format minute.
		        System.out.printf("Minute: %1$tM \n", cal);
		 
		        // Format the second.
		        System.out.printf("Second: %1$tS \n", cal);
		 
		
		//Question 6: in ra thông tin account (như Question 8 phần FOREACH) theo định dạng table (giống trong Database) 
		        System.out.printf("%s  %n","khongvan@gmail.com");
		        System.out.printf("%s %n", "Khổng Thị Vân");
		        System.out.printf("%s %n", "Sale");
		//Question 7: in ra danh sách các account đã join group vào ngày nào theo định dạng table Date sẽ được định dạng theo format như sau: 24/04/2020 11h:16p:20s 
	}
}
