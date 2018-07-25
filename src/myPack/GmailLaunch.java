package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLaunch {

	@Test
	public void logIn() throws Exception{
		//Initiate Gecko driver
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//Navigate to Gmail page
		driver.get("https://yahoo.com");
		
		//Maximize the window size
		driver.manage().window().maximize();
		
		//Close the window
		driver.close();
		
	}
}