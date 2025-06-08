package TestNG.Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CICD_File_Selenium_TEST {
	WebDriver driver;
	
	@Test
	public void setup() {
		
		 driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	
	@Test
	public void print() {
System.out.println("QA");

	}
	
	
	@Test
	public void print2() {
System.out.println("QA2");

	}
	
}
