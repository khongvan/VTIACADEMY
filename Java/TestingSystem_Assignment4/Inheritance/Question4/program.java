package Question4;

import java.util.Scanner;

public class program {
	 public static void main(String[] args) {
	        DSTL ds = new DSTL();
	        Danhsach();
	        byte chon;

	        do {
	            Danhsach();
	            Scanner sc = new Scanner(System.in);

	            chon = sc.nextByte();
	            switch (chon){
	                case 1:
	                    ds.nhapTaiLieu();
	                    break;
	                case 2:
	                    ds.hienTaiLieu();
	                    break;
	                case 3:
	                    ds.timTaiLieu();
	                    break;
	                case 4:
	                    ds.xoaTaiLieu();
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Nhập sai ! Vui lòng nhập lại !");
	                    break;
	            }
	            sc.close();
	        }while (chon != 0);
	        


	    }
	    public static void Danhsach(){
	        System.out.println("=========MENU==========");
	        System.out.println("|==  1. Thêm tài liệu ==|");
	        System.out.println("|==  2. Hiện tài liệu ==|");
	        System.out.println("|==  3. Tìm tài liệu  ==|");
	        System.out.println("|==  4. Xóa tài liệu  ==|");
	        System.out.println("|==  0. Thoát         ==|");
	        System.out.println("|=======================|");
	    }
}
