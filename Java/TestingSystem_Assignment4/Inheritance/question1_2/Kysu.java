package question1_2;

import java.util.Scanner;

public class Kysu extends Canbo{
	private String nganhDT;

	public String getNganhDT() {
		return nganhDT;
	}

	public void setNganhDT(String nganhDT) {
		this.nganhDT = nganhDT;
	}
	
	 public void Input(){
	        super.Input();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập ngành đào tạo: ");
	        setNganhDT(sc.nextLine());
	        sc.close();
	    }
	    public void Output(){
	        super.Output();
	        System.out.println("Ngành đào tạo  : " + getNganhDT());
	    }
	    
	
	

}
