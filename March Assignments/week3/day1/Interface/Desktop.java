package org.learnInterface;

public class Desktop implements Software,Hardware {
	public void softwareResources() {
		System.out.println("Available");		
	}

	public void softwareNos() {
		System.out.println("24");		
		
	}
	public String hardwareResources() {
				
		return "Not Available";
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		System.out.println(obj.hardwareResources());
		obj.softwareNos();
		obj.softwareResources();
		
		
	}

	



}
