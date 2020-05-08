package Question3;

public class Student extends Person {
	int id;
	
	public Student(String name) {
		super(name);
		
	}
	public Student(String name, int id) {
		super(name);
		this.id = id;
	}

}
