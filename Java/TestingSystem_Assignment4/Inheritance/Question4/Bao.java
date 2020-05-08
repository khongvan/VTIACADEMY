package Question4;

import java.util.Scanner;

public class Bao extends Tailieu{
	private String ngayPH;

	

	public String getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(String ngayPH) {
		this.ngayPH = ngayPH;
	}
	public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày phát hành: ");
        setNgayPH(sc.nextLine());
        sc.close();
    }
    public void Output(){
        super.Output();
        System.out.println("Ngày phát hành  : " + getNgayPH());
    }
    
	
	
}
