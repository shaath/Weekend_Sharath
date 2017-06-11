package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiosEg3 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		List<WebElement> group1=driver.findElements(By.name("group1"));
		System.out.println(group1.size());
		for (int i = 0; i < group1.size(); i++) 
		{
			String text=group1.get(i).getAttribute("value");
			if (text.equalsIgnoreCase("cheese"))
			{
				group1.get(i).click();
				break;
			}
		}
	}

}
