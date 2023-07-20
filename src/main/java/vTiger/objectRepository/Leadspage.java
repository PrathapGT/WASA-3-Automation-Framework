package vTiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTiger.Genericutilities.WebdriverUtility;

public class Leadspage extends WebdriverUtility{
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement Leadsimglookup;
	
	
	public Leadspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getLeadsimglookup() {
		return Leadsimglookup;
	}

	
	//Business Libraries
	
	public void clickonleadslink() {
		Leadsimglookup.click();
	
	}
}
