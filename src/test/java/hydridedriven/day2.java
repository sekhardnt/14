package hydridedriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class day2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D:\\datadriven\\registration.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		day1 a=new day1();
		a.openingbrowser();
		for(int i=0;i<=11;i++)
		{
			r=s.getRow(i);
			String str=r.getCell(1).getStringCellValue();
			if(str.equals("Firstname"))
				a.Firstname(r.getCell(0).getStringCellValue());
			else if(str.equals("Lastname"))
				a.Lastname(r.getCell(0).getStringCellValue());
			else if(str.equals("Phone"))
				a.Phone(r.getCell(0).getNumericCellValue());
			else if(str.equals("Email"))
				a.Email(r.getCell(0).getStringCellValue());
			else if(str.equals("Address"))
				a.Address(r.getCell(0).getStringCellValue());
			else if(str.equals("City"))
				a.City(r.getCell(0).getStringCellValue());
			else if(str.equals("State"))
				a.State(r.getCell(0).getStringCellValue());
			else if(str.equals("Pincode"))
				a.Pincode(r.getCell(0).getNumericCellValue());
			else if(str.equals("Country"))
				a.Country(r.getCell(0).getStringCellValue());
			else if(str.equals("Username"))
				a.Username(r.getCell(0).getStringCellValue());
			else if(str.equals("Password"))
				a.Password(r.getCell(0).getStringCellValue());
			else if(str.equals("Confirmpassword"))
				a.Confirmpassword(r.getCell(0).getStringCellValue());
		
				
		}
		a.Submit();
		

	}

}
