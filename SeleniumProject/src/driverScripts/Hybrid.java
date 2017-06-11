package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws IOException 
	{
		DateFormat date=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d=new Date();
		String x=date.format(d);
		String y=((x.replace("/", "")).replace(" ", "")).replace(":", "");
		
		
		String res=null;
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\New_Weekend\\SeleniumProject\\src\\testData\\Hybrid.xlsx";
		String xlout="F:\\New_Weekend\\SeleniumProject\\src\\results\\Hybridres"+y+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws1=wb.getSheet("Testcase");
		XSSFSheet ws2=wb.getSheet("Teststeps");
		XSSFSheet ws3=wb.getSheet("TestData");
		XSSFSheet ws4=wb.getSheet("Empreg");
		
		int tcRc=ws1.getLastRowNum();
		int tsRc=ws2.getLastRowNum();
		int empRc=ws4.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++) 
		{
			ws1.getRow(i).createCell(3);
			String exe=ws1.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y")) 
			{
				String tcId=ws1.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws2.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws2.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch(ws3.getRow(1).getCell(0).getStringCellValue());
							break;
						case "login":
							String u=ws3.getRow(1).getCell(1).getStringCellValue();
							String p=ws3.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= empRc; k++) 
							{
								String f=ws4.getRow(k).getCell(0).getStringCellValue();
								String l=ws4.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws4.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":
							String ename=ws3.getRow(1).getCell(5).getStringCellValue();
							String uname=ws3.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws3.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws3.getRow(1).getCell(8).getStringCellValue();
							res=om.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":	
							String un=ws3.getRow(1).getCell(6).getStringCellValue();
							String ps=ws3.getRow(1).getCell(7).getStringCellValue();
							res=om.org_Login(un, ps);
							break;
							
						default:
							System.out.println("Enter Valid Keyword");
							break;
						}
						
						ws2.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws1.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws1.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws1.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();

	}

}