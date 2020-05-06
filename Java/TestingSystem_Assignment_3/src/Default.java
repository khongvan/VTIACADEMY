import java.util.Date;

public class Default {

	public static void main(String[] args) {
		/*Question 1: Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo): 
		 *  Email: "Email 1" 
		 *  Username: "User name 1" 
		 *  FullName: "Full name 1"
		 * CreateDate: now 
		 */
		System.out.println("================");
		Account[] ac = new Account[5];
		for (int i=0; i< ac.length; i++) {
			ac[i] = new Account ();
			ac[i].email = "Email 1";
			ac[i].userName = "User name 1";
			ac[i].fullName = "Full name 1";
			ac[i].createDate  =new Date () ;
		}
		for (Account account1: ac) {
			System.out.println(account1.email);
			System.out.println(account1.userName);
			System.out.println(account1.fullName);
			System.out.println(account1.createDate);
		}
		

	}

}
