package question1_2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
        DLCB dscb = new DLCB();
        DL();
        byte chon;

        do {
            Scanner sc = new Scanner(System.in);
            DL();
            chon = sc.nextByte();
            
            switch (chon){
            case 1:
                dscb.nhapCanbo();
                break;
            case 2:
                dscb.hienCanbo();
                break;
            case 3:
                dscb.timCanbo();
                break;
            case 4:
                dscb.xoaCanbo();
                break;
            case 0:
                break;
            default:
                System.out.println("Nhập sai ! Nhập lại !");
                break; 
            }
            sc.close();
        }while (chon != 0);

       
    }
	
    public static void DL(){
        System.out.println(" =========MENU==========");
        System.out.println(" |==  1. Thêm cán bộ == |");
        System.out.println(" |==  2. Hiện cán bộ == |");
        System.out.println(" |==  3. Tìm cán bộ  == |");
        System.out.println(" |==  4. Xóa cán bộ  == |");
        System.out.println(" |==  0. Thoát       == |");
        System.out.println(" |===================== |");
    }
}




