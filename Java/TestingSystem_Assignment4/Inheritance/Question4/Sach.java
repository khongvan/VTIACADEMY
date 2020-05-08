package Question4;

import java.util.Scanner;

public class Sach extends Tailieu {
	 private String tenTG;
	    private int soTrang;
	    
		public String getTG() {
			return tenTG;
		}
		public void setTenTG(String tenTG) {
			this.tenTG = tenTG;
		}
		public int getSoTrang() {
			return soTrang;
		}
		public void setSoTrang(int soTrang) {
			this.soTrang = soTrang;
		}
	    
		public void Input(){
	        super.Input();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập tên tác giả: ");
	        setTenTG(sc.nextLine());
	        System.out.println("Nhập số trang: ");
	        setSoTrang(sc.nextInt());
	        sc.close();
	    }
	    public void Output(){
	        super.Output();
	        System.out.println("Tên tác giả  : " + getTG());
	        System.out.println("Số trang  : " + getSoTrang());
	    }
}
