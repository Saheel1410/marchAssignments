package org.college;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name :- Saheel");

	}
	
	public void studentDept() {
		System.out.println("Dept :- Machanical");
	}
	public void studentId() {
		System.out.println("studentId :- 077");
	} 
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeRank();
		obj.collegeCode();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
