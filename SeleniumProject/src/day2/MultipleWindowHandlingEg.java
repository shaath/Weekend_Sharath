package day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandlingEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
				
		String gmail=driver.getWindowHandle();
		System.out.println(gmail);
		
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> x=driver.getWindowHandles();
		
		Iterator<String> it=x.iterator();
		
		while (it.hasNext())
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
			try 
			{
				driver.findElement(By.xpath("html/body/div[2]/header/div[4]/div/div/div/span/a/span")).click();
				break;
			} 
			catch (Exception e) 
			{
				System.out.println("Expected element not available in in this page");
			}
			
		}
		
		driver.switchTo().window(gmail);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
