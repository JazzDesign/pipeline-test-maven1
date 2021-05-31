package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("https://www.google.com/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver","./webdriver/linux/geckodriver");
	    driver = new FirefoxDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}	

}