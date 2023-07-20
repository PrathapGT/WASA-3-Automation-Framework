package practice;

import org.testng.annotations.Test;

public class Testngpractice2 {

	
	@Test(invocationCount=-3)
	
	public void createuser() {
		
		System.out.println("insertuser");
	}
	
	@Test
	
	public void updateuser() {
		
		System.out.println("update");
	}
	
	@Test
	
	public void deleteuser() {
		
		System.out.println("delete");
	}
}
