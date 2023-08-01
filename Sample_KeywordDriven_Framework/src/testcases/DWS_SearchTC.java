package testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excelUtility.ExcelLibrary;
import keywordDriven.Action_Keyword;

public class DWS_SearchTC {

	
		// TODO Auto-generated method stub
		
		@Test
		public void TC1() throws IOException, Exception {
			
			// Read Keywords from Test Case File
			ExcelLibrary lib=new ExcelLibrary();
			ArrayList<String>b=lib.read_keyword();			
			
			// Creating an object of KeyWord Class
			Action_Keyword ak=new Action_Keyword();
			
			for(int i=0;i<=b.size()-1;i++) {
				switch(b.get(i)) {
				case "openBrowser":
					ak.openBrowser();
					break;
				case "navigate":
					ak.navigate();
					break;
				
				case "EnterText":
					ak.EnterText("xpath", "Searchtxt", "mobiles");
					break;
				
				case "clickelement":
					ak.clickelement("xpath","Searchbtn");
					break;
				
				case "closebrowser":
					ak.closebrowser();
					break;
				
				case "wait":
					Thread.sleep(2000);
					
				default:
					break;
				}
			}
		
		
		
		
	}

}
