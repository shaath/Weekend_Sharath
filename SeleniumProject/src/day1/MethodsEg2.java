package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);

		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);

		driver.navigate().forward();
		
		Sleeper.sleepTightInSeconds(5);

		driver.navigate().refresh();
	}

}
