package keywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import utility.Constants;

public class Action_Keyword {
	
	public WebDriver driver;	
	Properties prop=new Properties();
	
		
	//To return the Locators 
	public By getObject(String locatorType,String Objectname) {
				
		if(locatorType.equalsIgnoreCase("xpath")) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(new File("./Object_Repository/Repository.properties"));
				prop.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return By.xpath(prop.getProperty(Objectname));
		}
		
		
		return null;
	}
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void navigate() {
		driver.get(Constants.URL);
	}
	
	public void closebrowser() {
		driver.quit();
	}
	
	public void EnterText(String locatorType,String Objectname,String val) {
		//driver.findElement(By.id("small-searchterms")).sendKeys(val);
		driver.findElement(getObject(locatorType, Objectname)).sendKeys(val);
	}
	
	public void clickelement(String locatorType,String Objectname) {
		driver.findElement(this.getObject(locatorType,Objectname)).click();
	}

}
