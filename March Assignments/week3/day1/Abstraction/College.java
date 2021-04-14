package org.learnAbstraction;

public class College extends University {
	@Override
	public void ug() {
		System.out.println("Welcome ug Students");
	}

	public static void main(String[] args) {
College obj = new College();
obj.ug();
obj.pg();
	}
}