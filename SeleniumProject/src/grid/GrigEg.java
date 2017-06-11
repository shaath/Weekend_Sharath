package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GrigEg 
{
	@Parameters("browser")
	@Test
	public void grid(String br) throws MalformedURLException
	{
		DesiredCapabilities cap=null;
		if (br.equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setPlatform(Platform.ANY);
		}
		else if (br.equalsIgnoreCase("chrome")) 
		{
			cap=DesiredCapabilities.chrome();
			cap.setPlatform(Platform.WINDOWS);
		}
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setPlatform(Platform.ANY);
		
//		DesiredCapabilities cap=DesiredCapabilities.chrome();
//		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://10.172.0.35:4444/wd/hub"), cap);
		String date="18/november/2017";
		String[] split=date.split("/");
		String day=split[0];
		String month=split[1];
		String year=split[2];
		System.out.println(day+"---"+month+"------"+year);
		
		
		driver.get("https://www.cleartrip.com/");
		
		
		driver.findElement(By.id("DepartDate")).click();
		//
		String calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!year.equals(calYear)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!month.equalsIgnoreCase(calmonth)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		for (int i = 0; i < cols.size(); i++) 
		{
			String calday=cols.get(i).getText();
			if (day.equals(calday))
			{
				cols.get(i).click();
				break;
			}
		}
	}

}
