package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLogOutTest {

	@Test
	public void logOut() throws InterruptedException{
		
		//Initiate Gecko driver
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		//Navigate to Gmail page
		driver.get("https://gmail.com");
		
		//Maximize the window size
		driver.manage().window().maximize();
		
		//Enter valid user name
		driver.findElement(By.id("identifierId")).sendKeys("newuser091995@gmail.com");
		
		//Click on Next button
		driver.findElement(By.cssSelector("#identifierNext > content.CwaK9 > span.RveJvd.snByac")).click();
		Thread.sleep(3000);
		
		//Enter valid password
		driver.findElement(By.name("password")).sendKeys("newuser@1");
		
		//Click on Next button
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		Thread.sleep(3000);
		
		//Verify if user is successfully log in
		Assert.assertTrue(driver.findElement(By.cssSelector("span.gb_db.gbii")).isDisplayed());
		
		//Click on the user icon button
		driver.findElement(By.cssSelector("span.gb_db.gbii")).click();
		Thread.sleep(3000);
		
		//Verify if sign out button is displayed
		Assert.assertTrue(driver.findElement(By.id("gb_71")).isDisplayed());
		
		//Click on sign out button
		driver.findElement(By.id("gb_71")).click();
		Thread.sleep(5000);
		
		//Verify if user is successfully log-out
		Assert.assertTrue(driver.findElement(By.cssSelector("span.RveJvd.snByac")).isDisplayed());
	}
}
