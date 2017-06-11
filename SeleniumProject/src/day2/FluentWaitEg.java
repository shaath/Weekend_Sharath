package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
											.withTimeout(40, TimeUnit.SECONDS)
											.pollingEvery(2, TimeUnit.SECONDS)
											.ignoring(NoSuchElementException.class);

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[1]/div[2]/div/div[2]/div[1]/div/a"))).click();
	}

}
