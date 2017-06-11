package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import methods.OrgMaster;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlOps {

	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\New_Weekend\\SeleniumProject\\src\\testData\\EmpregData.xlsx";
		String xlout="F:\\New_Weekend\\SeleniumProject\\src\\results\\EmpFRes.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
//		XSSFRow r=ws.getRow(5);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		XSSFCellStyle style=wb.createCellStyle();
		
		XSSFFont font=wb.createFont();
		
		
		for (int i = 1; i <= Rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"-----"+l);
			
			String res=om.org_Empreg(f, l);
			
			c2.setCellValue(res);
			
			
			
//			if (res.equalsIgnoreCase("Pass"))
//			{
//				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			}
//			else 
//			{
//				style.setFillForegroundColor(IndexedColors.RED.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			}
			
			if (res.equalsIgnoreCase("Pass"))
			{
				font.setColor(IndexedColors.GREEN.getIndex());
				style.setFont(font);
			}
			else
			{
				font.setColor(IndexedColors.RED.getIndex());
				style.setFont(font);
			}
			c2.setCellStyle(style);
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		om.org_Logout();
		om.org_Close();
	}

}
