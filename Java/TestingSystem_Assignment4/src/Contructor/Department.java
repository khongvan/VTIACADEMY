package Contructor;

public class Department {
	int id;
	String name;
	
	//a) không có parameters 
	public Department(){}
	
	//b) Có 1 parameter là nameDepartment và default id của Department = 0 
	public Department(String name){
		this.name= name;
		this.id=0;
	}
}
