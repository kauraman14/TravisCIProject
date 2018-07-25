package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleLaunchAndSearch {

	@Test
	public void googleLaunch() throws Exception{
		//Initiate Gecko driver
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//Navigate to Google 
		driver.get("https://google.com");
		
		//Maximize the window size
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("mobile wallpaper 1234567");
		
		driver.findElement(By.name("btnK")).click();
		
		//Close the window
		driver.close();
		
	}
}
