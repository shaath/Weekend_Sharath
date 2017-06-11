package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout 
{
	public static WebDriver driver;
	@Given("^The browser launched and navigated to url$")
	public void the_browser_launched_and_navigated_to_url() throws Throwable
	{
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com");
	   driver.manage().window().maximize();
	}

	@When("^the tester enters username and password$")
	public void the_tester_enters_username_and_password() throws Throwable
	{
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^also clicks on login$")
	public void also_clicks_on_login() throws Throwable 
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome admin message displayed$")
	public void welcome_admin_message_displayed() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(3);
	    String expval="Welcome Admin";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getText();
	    Assert.assertEquals(expval, actval);
	}

	@When("^the tester clicks on welcome admin link$")
	public void the_tester_clicks_on_welcome_admin_link() throws Throwable 
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout$")
	public void also_clicks_on_logout() throws Throwable 
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Login page displayed$")
	public void login_page_displayed() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(3);
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}

}
