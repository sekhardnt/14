package keyworddrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class day2{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\datadriven\\data.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s= w.getSheet("sheet1");
		day1 a=new day1();
		Row r=null;
		Cell c=null;
		Iterator<Row> i=s.iterator();
		while(i.hasNext())
		{
			r=i.next();
			String str=r.getCell(2).getStringCellValue();
			if(str.equals("Opening_Bowser"))
			{
				a.Opening_Bowser();
			}
			else if(str.equals("Navigate_google"))
			{
				a.Navigate_google();
			}
			else if(str.equals("Text_box"))
			{
				a.Text_box();
			}
			else if(str.equals("Search"))
			{
				a.Search();
			}
			else if(str.equals("Close"))
			{
				a.Close();
			}
		}
		
		
		

	}

}
