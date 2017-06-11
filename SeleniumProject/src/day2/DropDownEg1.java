package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(2);
//		Sleeper.sleepTightInSeconds(5);
//		s.selectByValue("saab");
//		Sleeper.sleepTightInSeconds(5);
//		s.selectByVisibleText("audi");
		
		List<WebElement> clist=s.getOptions();
		System.out.println(clist.size());
		
		for (int i = 0; i < clist.size(); i++) 
		{
			s.selectByIndex(i);
			System.out.println(clist.get(i).getText());
		}
	}

}
