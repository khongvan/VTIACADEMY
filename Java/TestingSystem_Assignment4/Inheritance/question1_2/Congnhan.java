package question1_2;

import java.util.Scanner;

public class Congnhan extends Canbo {
	private byte bac;

    public byte getBac() {
        return bac;
    }
    
    public void  setBac(byte bac) {
        this.bac=bac;
    }
    
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cấp bậc của công nhân: ");
        setBac(sc.nextByte());
        sc.close();
    }
   
    public void Output(){
       super.Output();
       System.out.println("Cấp bậc công nhân  : " + getBac());
    }

	

}
