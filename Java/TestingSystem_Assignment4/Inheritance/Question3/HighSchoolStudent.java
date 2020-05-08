package Question3;

public class HighSchoolStudent extends Student{
	String clazz;
	String desiredUniversity;
	
	public HighSchoolStudent(String name, int id) {
		super(name, id);
		}
	
	public HighSchoolStudent(String name, String clazz, String desiredUniversity) {
		super(name);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}



	
		
	

	
}
