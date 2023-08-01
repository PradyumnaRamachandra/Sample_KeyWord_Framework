package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void Demo() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("debuggerAddress","localhost:9222");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}
}
