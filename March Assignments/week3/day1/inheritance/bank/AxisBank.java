package org.bank;

public class AxisBank extends BankInfo {
	public void deposits() {
		System.out.println("This is new deposits Account");
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposits();
		obj.fixed();
		obj.savings();

	}

}
