import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		/*Question 3:  Viết chương trình nhập vào 4 số nguyên. 
		 * Hiển thị ra số lớn nhất và nhỏ nhất 
		 */
				int nb[] =new int [] {1,2,3,4};
				int min = nb [0];
				int max = nb [0];
				for (int i =0; i < nb.length; i++) {
					if (nb [i]< min) {
						min = nb [i];
					}
					if (nb [i]> max) {
						min = nb [i];
					}
				}
				System.out.println("Số nhỏ nhất là:" +min);
				System.out.println("Số lớn nhất là : " +max);
				
		/*Question 4:Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó. 
		 *  Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất bé hơn số thứ hai].  
		 * Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [số thứ nhất nhỏ hơn số thứ hai]. 
		 */
				Scanner sc = new Scanner (System.in);
				System.out.println("Nhập a = " );
				int a = sc.nextInt();
				System.out.println("Nhập b =" );
				int b = sc.nextInt();
				int hieu = a -b;
				System.out.println(a + " - " +b + " = " + hieu);
				System.out.println(hieu > 0 ? " Số thứ nhất bé hơn số thứ hai" : "số thứ nhất nhỏ hơn số thứ hai");
				sc.close();
			
		//Question 5:  Nhập vào 2 số tự nhiên c và d. Kiểm tra xem c có chia hết cho d không 
				Scanner scanner = new Scanner (System.in);
				System.out.println("Nhập c = " );
				int c = scanner.nextInt();
				System.out.println("Nhập d =" );
				int d = scanner.nextInt();
				int thuong = c / d;
				System.out.println(c + " : " +d + " = " + thuong);
				System.out.println(thuong != 0 ? " c có chia hết cho d" : "c không chia hết cho d");
				scanner.close();
	}

}
