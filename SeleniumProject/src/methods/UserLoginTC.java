package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		//Launch
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		//Login
		res=om.org_Login("SharathChandra12345", "SharathChandra12345");
		System.out.println("Application Login "+res);
		//Logout
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		//Close
		om.org_Close();
		System.out.println("Application Close Succccessfull");
		

	}

}