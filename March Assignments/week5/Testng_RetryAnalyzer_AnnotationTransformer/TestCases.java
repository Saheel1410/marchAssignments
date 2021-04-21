package testAnalyzer01;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestCases {
	@Test(retryAnalyzer = RetryAnlyzr.class)
	public void createLead() {
		System.out.println("CreateLead");
		throw new NoSuchElementException();

	}
	@Test
	public void editLead() {
		System.out.println("editLead");

	}
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");

	}
	@Test
	public void mergeLead() {
		System.out.println("mergeLead");

	}
	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}
	

}
