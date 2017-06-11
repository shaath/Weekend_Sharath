package day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEq3 {
	public static void main(String args[]) throws IOException{
		
		WebDriver Driver=new FirefoxDriver();
		Driver.get("http://primusbank.qedgetech.com/sitemap.html");
		Driver.manage().window().maximize();
		WebElement block=Driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
        List<WebElement> links=block.findElements(By.tagName("a"));
	    for(int i=0;i<links.size();i++)
	    {
	    	String a =links.get(i).getText();
	    	links.get(i).click();
	    	
	    	
	    	System.out.println(Driver.getTitle()+" "+Driver.getCurrentUrl());
	    	Sleeper.sleepTightInSeconds(3);
	    	
	    	File src=((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\New_Weekend\\SeleniumProject\\src\\screenshots\\"+a+".png"));
			
	    	
	    	Driver.navigate().back();
	    	block=Driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
	    	links=block.findElements(By.tagName("a"));

	    	
	    	
	    }
	}

}
