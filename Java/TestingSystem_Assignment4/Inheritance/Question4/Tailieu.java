package Question4;

import java.util.Scanner;

public class Tailieu {
	private int maTL;
    private String tenNXB;
    private int sobanPH;
    
	public int getMaTL() {
		return maTL;
	}
	public void setMaTL(int maTL) {
		this.maTL = maTL;
	}
	
	public String getTeNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	
	public int getSoBanPhatHanh() {
		return sobanPH;
	}
	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.sobanPH = soBanPhatHanh;
	}
    
	 public void Input(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập mã tài  liệu: ");
	        setMaTL(sc.nextInt());
	        System.out.println("Nhập tên NXB ");
	        setTenNXB(sc.nextLine());
	        System.out.println("Nhập số bàn phát hành");
	        setSoBanPhatHanh(sc.nextInt());
	        sc.close();
	    }
	    public void Output(){
	        System.out.println("Mã tài liệu      : " + getMaTL());
	        System.out.println("Tên NXB        	 : " + getTeNXB());
	        System.out.println("Số bàn phát hành : " + getSoBanPhatHanh());
	  
	    }
	    
		@Override
		public String toString() {
			return "Tailieu [maTL=" + maTL + ", tenNXB=" + tenNXB + ", sobanPH=" + sobanPH + "]";
		}
		
		
	    

    
}
