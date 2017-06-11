package methods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseEg {

	public static void main(String[] args) throws IOException
	{
		BasicMethodsEg bm=new BasicMethodsEg();
		
//		bm.function1();
		
//		int res=bm.sum(60,40);
//		System.out.println(res);
		
	
//		bm.launch_Br("ie");
		
		bm.launch_Br("firefox", "http://opensource.demo.orangehrmlive.com");
		bm.send_Text("id", "txtUsername", "Admin");
		bm.takes_Screenshot("F:\\New_Weekend\\SeleniumProject\\src\\screenshots\\orgHRM.png");
		
		
	}

}
