package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="small-searchterms")
	static WebElement searchtxt;
	
	@FindBy(xpath="//input[@value='Search']")
	static WebElement searchbtn;
	
	public static WebElement getsearchtxt() {
		return searchtxt;
	}
	
	public static WebElement getsearchbtn() {
		return searchbtn;
		
	}

}
