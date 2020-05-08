package Question4;

import java.util.Scanner;

public class Tapchi extends Tailieu {
	 private  int soPH;
	 private   byte thangPH;
	 
	 
	 public int getSoPH() {
		return soPH;
	}

	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}

	public byte getThangPH() {
		return thangPH;
	}

	public void setThangPH(byte thangPH) {
		this.thangPH = thangPH;
	}
	 
	public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phát hành: ");
        setSoPH(sc.nextInt());
        System.out.println("Nhập tháng phát hành: ");
        setThangPH(sc.nextByte());
        sc.close();
    }
    public void Output(){
        super.Output();
        System.out.println("số phát hành  : " + getSoPH());
        System.out.println("tháng phát hành : " + getThangPH());
    }
}
