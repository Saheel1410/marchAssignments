package org.overLoading;

public class Student {
	public void getStudentInfo(int id) {
		String name = "sk";
		
System.out.println(name);
System.out.println(id);
	}
	
	public void getStudentInfo(int id,String Name) {
		
		
System.out.println(id);
System.out.println(Name);
	}
	
	public void getStudentInfo(String email,int phoneNum) {
	
System.out.println(phoneNum);
System.out.println(email);
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.getStudentInfo(123);
		obj.getStudentInfo(1234, "Saheel");
		obj.getStudentInfo("saheel1410@gmail.com", 763998111);
	}
}
