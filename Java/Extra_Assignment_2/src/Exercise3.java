import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		/* Question 4:  Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. */
	    int n, soDu, tong = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.println("Nhập vào số nguyên bất kỳ: ");
	    n = scanner.nextInt();
	         
	    while (n > 0) {
	        soDu = n % 10;
	        n = n / 10;
	        tong += soDu;
	    }
	         
	    System.out.println("Tổng các chữ số = " + tong);
	    scanner.close();
	}
}
