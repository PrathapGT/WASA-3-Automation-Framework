package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderpractice {

	@Test(dataProvider="phone")
	
	public void addproduct(String phone, int price) {
		
		System.out.println(phone+"----"+price);
	}
	
	@DataProvider
	
	public Object[][] getdata() {
		
		Object[][] data=new Object[3][2];
		
		
		data[0][0]="vivo";
		data[0][1]=10000;
		
		
		data[1][0]="Redmi";
		data[1][1]=12000;
		
		data[2][0]="samsung";
		data[2][1]=15000;
		
		
		
		
		
		
		
		return data;
		
		
		
		
		
	}
	
}
