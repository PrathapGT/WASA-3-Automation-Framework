package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {

@Test

public void clickonelement() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
      driver.get("https://artoftesting.com/samplesiteforselenium");		
		Actions act=new Actions(driver);
		
		
		Thread.sleep(20);

		WebElement searchbox = driver.findElement(By.name("firstName"));
		
		
		Thread.sleep(20);
		act.contextClick().build().perform();
		
		System.out.println(searchbox+"right click action done");
		
	}

}
