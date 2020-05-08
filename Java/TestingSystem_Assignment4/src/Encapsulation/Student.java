package Encapsulation;

public class Student {
	private int id;
	private String name;
	private String hometown;
	private float diem;
	
	public Student() {
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHometown() {
		return hometown;
	}


	public void setHometown(String hometown) {
		this.hometown = hometown;
	}


	public float getDiem() {
		return diem;
	}


	/*b) Tạo constructor cho phép khi khởi tạo mỗi student thì người dùng sẽ nhập vào tên, hometown và có điểm học lực = 0  */
	public Student (String name,String hometown) {
		this.name=name;
		this.hometown=hometown;
		this.diem=0;
	}
	
	//c) Tạo 1 method cho phép set điểm vào
	public void setDiem(float diem) {
		this.diem=diem;
	}
	
	//d) Tạo 1 method cho phép cộng thêm điể
	public void setDiem(float dem, float diemcong) {
        this.diem = diem + diemcong;
    }
	
	/*e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, 
	 * nếu điểm > 4.0 và < 6.0 thì sẽ in ra là trung bình, 
	 * nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi) 
	 */
	public void getStudent(String name, float diem){
        String xeploai = "";
        if (diem<=4){
            xeploai = "Yếu";
        }
        else if(diem<=6){
            xeploai = "Trung bình";
        }
        else if (diem<=8){
            xeploai = "Khá";
        }
        else if (diem<=10){
            xeploai = "Giỏi";
        }
        else {
            xeploai = "Điểm không hợp lệ";
        }
        System.out.println("Tên sinh viên: " + name + " Điểm học lực: " + diem + " Xếp loại: " + xeploai);
    }
	
	
}

