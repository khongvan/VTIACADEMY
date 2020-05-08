package question1_2;

import java.util.ArrayList;
import java.util.Scanner;

	public class DLCB {
	ArrayList<Canbo> c = new ArrayList<>();
		public void nhapCanbo(){
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập số cán bộ muốn nhập:  ");
			n = sc.nextInt();
			byte chon;
			Canbo cb = new Canbo();
			for (int i = 0; i < n; i++) {
            System.out.println("Bạn muốn nhập cán bộ nào? (1:Công nhân || 2: Kỹ sư || 3: Nhân Viên) ");
            chon = sc.nextByte();
            switch (chon){
                case 1:
                    cb = new Congnhan();
                    break;
                case 2:
                    cb = new Kysu();
                    break;
                case 3:
                    cb = new Nhanvien();
                    break;
                default:
                    System.out.println("Nhập sai !");
                    i--;
                    break;
            }
            	cb.Input();
            	c.add(cb);
			}
			sc.close();
		}
    
		public void hienCanbo(){
			for (Canbo cb: c) {
				cb.Output();
			}
		}
		public void timCanbo(){
			Scanner sc = new Scanner(System.in);
			String hoTen;
			System.out.println("Nhập họ tên cần tìm: ");
			hoTen = sc.nextLine();
			for (Canbo cb:c) {
				if (hoTen.equals(cb.getName())){
                cb.Output();
				}
			}
			sc.close();
		}
    
		public void xoaCanbo(){
			Scanner sc = new Scanner(System.in);
			String hoTen;
			System.out.println("Nhập họ tên cần xóa: ");
			hoTen = sc.nextLine();
			for (Canbo cb:c) {
            if (hoTen.equals(cb.getName())){
                c.remove(cb);
            	}
			}
			sc.close();
		}
    
}


