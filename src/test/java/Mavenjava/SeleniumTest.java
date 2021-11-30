package Mavenjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void getWebsite() {
		driver.get("http://cleartrip.com");
		driver.findElement(By.cssSelector("input[placeholder='Any worldwide city or airport']")).click();
		
		
	}
	
	@Test
public void ElementsAutomation() {
		driver.get("http://expedia.com");
		
}
}
