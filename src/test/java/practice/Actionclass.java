package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {

	public static void main(String[] args) {

		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.cricbuzz.com/");
		
		Actions act=new Actions(driver);
		
		
		WebElement hover = driver.findElement(By.id("newsDropDown"));
		
		
		act.moveToElement(hover).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		 //driver.findElement(By.linkText("IND vs WI - WI Won")).click();
		
		//act.moveToElement(match).build().perform();
		//act.click();
		
		
		
	}

}
