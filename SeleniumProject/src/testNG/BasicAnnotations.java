package testNG;


import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations 
{
	@Test(priority=0)
	public void function1()
	{
		System.out.println("This is Function1 code");
	}
	
	@Test(priority=1)
	public void function2()
	{
		System.out.println("This is Function2 code");
//		throw new SkipException("This method not yet implemented");
	}
	
	@Test(priority=2)
	public void apple()
	{
		System.out.println("This is Apple code");
	}

	@BeforeMethod
	public void bm()
	{
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("This is After Method");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("This is Before class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("This is After Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before test");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is After Test");
	}
}
