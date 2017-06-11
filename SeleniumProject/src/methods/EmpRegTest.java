package methods;

import java.io.IOException;

public class EmpRegTest {

	public static void main(String[] args) throws IOException
	{
		OrgMaster om=new OrgMaster();
		//Launch
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		//Login
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		//Empreg
		res=om.org_Empreg("Sharath", "Chandra");
		System.out.println("Employee Registration "+res);
		//Logout
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		//Close
		om.org_Close();
		System.out.println("Application Close Succccessfull");
		

	}

}
