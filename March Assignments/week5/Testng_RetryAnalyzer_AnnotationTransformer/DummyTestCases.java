package testAnalyzer01;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DummyTestCases {
	
	@Test(groups= {"smoke"})
	public void myntra() {
		System.out.println("myntra");
		throw new NoSuchElementException();
	}
	@Test(groups= {"regression"})
	public void leafTaps() {
		System.out.println("nykka");
	}
	@Test(groups= {"functionality"})
	public void redBus() {
		System.out.println("redBus");
	}
	@Test(groups= {"regression"},dependsOnGroups ="smoke")
	public void eRail() {
		System.out.println("eRail");
	}
	@Test(groups= {"functionality","smoke"})
	public void leafGrounds() {
		System.out.println("leafGrounds");
	}

}
