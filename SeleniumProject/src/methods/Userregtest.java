package methods;

import java.io.IOException;

public class Userregtest {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		//Launch
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		//Login
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		//Userreg
		res=om.org_Userreg("Sharath Chandra", "SharathChandra12345", "SharathChandra12345", "SharathChandra12345");
		System.out.println("User registration "+res);
		//Logout
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		//Close
		om.org_Close();
		System.out.println("Application Close Succccessfull");
		

	}

}
