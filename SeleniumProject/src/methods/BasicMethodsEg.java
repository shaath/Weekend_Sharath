package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicMethodsEg
{
	public static String course;
	public static WebDriver driver=null;
	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethodsEg bm=new BasicMethodsEg();
		
		bm.function3();
		boolean flag=bm.function4();
		System.out.println(flag);
		
	}

	//Static Method without returning anyvalue
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static Method with returning value
	
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Non Static method without returning anyvalue
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non satic method with returning value
	
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	//Sum
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	//Taking Screenshot
	
	public void takes_Screenshot(String path) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	}
	
	//Launching browser
	
	public void launch_Br(String br_Name,String url)
	{
		if (br_Name.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br_Name.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br_Name.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
	}
	//Sending text to textbox
	
	public void send_Text(String Loc, String value, String text)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("claassname"))
		{
			driver.findElement(By.className(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("tagname"))
		{
			driver.findElement(By.tagName(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("cssselector")) 
		{
			driver.findElement(By.cssSelector(value)).sendKeys(text);
		}
	}
	
}
