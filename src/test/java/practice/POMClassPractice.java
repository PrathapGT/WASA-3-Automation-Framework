package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTiger.objectRepository.Loginpage;

public class POMClassPractice {

	public static void main(String[] args) {

		
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:8888/");
		
		Loginpage lp=new Loginpage(driver);
		
		lp.logintoapp("admin", "admin");
	}

}
