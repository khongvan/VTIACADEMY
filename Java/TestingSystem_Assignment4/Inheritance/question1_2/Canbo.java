package question1_2;

import java.util.Scanner;

	public class Canbo {
		private String name;
		private byte age;
		private Gender gender;
		private String address;
    
		public Canbo() {

    }
    
    public Canbo(String name, byte age, Gender gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(int gender) {
		if (gender == 0){
            this.gender = Gender.valueOf("MALE");
        }
        else if(gender == 1){
            this.gender = Gender.valueOf("FEMALE");
        }
        else {
            this.gender = Gender.valueOf("UNKNOWN");
        }
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	 public void Input(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập h�? tên: ");
	        setName(sc.nextLine());
	        System.out.println("Nhập tuổi: ");
	        setAge(sc.nextByte());
	        System.out.println("Nhập giới tính");
	        setGender(sc.nextInt());
	        sc.nextLine();
	        System.out.println("Nhập địa chỉ: ");
	        setAddress(sc.nextLine());
	        sc.close();
	    }
	    public void Output(){
	        System.out.println("H�? tên      : " + getName());
	        System.out.println("Tuổi        : " + getAge());
	        System.out.println("Giới tính   : " + getGender());
	        System.out.println("�?ịa chỉ     : " + getAddress());
	    }

		@Override
		public String toString() {
			return "Canbo [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
		}
	   
	   
    
}
