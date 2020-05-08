package question1_2;

import java.util.Scanner;

public class Nhanvien extends Canbo{
	private String congviec;

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	
	 public void Input(){
	        super.Input();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập công việc: ");
	        setCongviec(sc.nextLine());
	        sc.close();
	    }
	    public void Output(){
	        super.Output();
	        System.out.println("Công việc nhân viên là   : " + getCongviec());
	    }
	
}
