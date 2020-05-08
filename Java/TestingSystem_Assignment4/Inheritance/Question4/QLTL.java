package Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class QLTL {
	 ArrayList<Tailieu> t = new ArrayList<>();
	    public void nhapTaiLieu(){
	        int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập số tài liệu mà bạn muốn nhập:  ");
	        n = sc.nextInt();
	        byte chon;
	        Tailieu tl = new Tailieu();
	        for (int i = 0; i < n; i++) {
	            System.out.println("Bạn muốn nhập tài liệu nào? (1:Sách || 2: Tạp chí || 3: Báo) ");
	            chon = sc.nextByte();
	            switch (chon){
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new Tapchi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    System.out.println("Nhập sai !");
                    i--;
                    break;
            }
	            tl.Input();
	            t.add(tl);
	        }
	        sc.close();
	    }
	    public void hienTaiLieu(){
	        for (Tailieu tl: t) {
	            tl.Output();
	        }
	    }
	    public void timTaiLieu(){
	        Scanner sc = new Scanner(System.in);
	        int chon;
	        System.out.println("Bạn muốn tìm kiếm theo loại nào? (1:Sách || 2: Tạp chí || 3: Báo)");
	        chon = sc.nextByte();
	        switch (chon){
	            case 1:
	                for (Tailieu tl: t) {
	                    if (tl instanceof Sach){
	                    	tl.Output();
	                    }
	                }
	                break;
	            case 2:
	                for (Tailieu tl: t) {
	                    if (tl instanceof Tapchi){
	                        tl.Output();
	                    }
	                }
	                break;
	            case 3:
	                for (Tailieu tl: t) {
	                    if (tl instanceof Bao){
	                        tl.Output();
	                    }
	                }
	                break;
	            default:
	                System.out.println("Nhập sai !");
	                break;
	        }
	        sc.close();

	    }
	    public void xoaTaiLieu(){
	        Scanner s = new Scanner(System.in);
	        int maTL;
	        System.out.println("Nhập mã tài liệu cần xóa: ");
	        maTL = s.nextInt();
	        for (Tailieu tl: t) {
	            if (maTL == tl.getMaTL()){
	                t.remove(tl);
	            }
	        }
	        s.close();
	    }
}
