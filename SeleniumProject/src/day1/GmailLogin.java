package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException
	{
		//Lanching the browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launching gmail 
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email textbox
		
		WebElement email=driver.findElement(By.id("identifierId"));
		//Enter text into email textbox 
		
		email.sendKeys("testingtoolstrainer449");
		//Clear the text from textbox
//		email.clear();
		//Clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		
//		Sleeper.sleepTightInSeconds(10);
//		Thread.sleep(5000);
		
		//Enter the password in password textbox
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		
		//Click on next button
		driver.findElement(By.cssSelector(".CwaK9")).click();
		
	}

}
