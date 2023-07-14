package datadrivenframework.ddf;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class day3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\datadriven\\data1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("sheet1");
		for(Row r:s)
		{
			for(Cell c:r)
			{
				System.out.println(c.toString());
			}
		}

	}

}
