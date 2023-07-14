package datadrivenframework.ddf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class day4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\datadriven\\data1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("sheet1");
		Iterator<Row> i=s.iterator();
		while(i.hasNext())
		{
			Row r=i.next();
			Iterator<org.apache.poi.ss.usermodel.Cell> celliterator=r.cellIterator();
			while(celliterator.hasNext())
			{
				org.apache.poi.ss.usermodel.Cell c=celliterator.next();
				if(c.getCellTypeEnum()==CellType.STRING)
				System.out.println(c.getStringCellValue());
				else if(c.getCellTypeEnum()==CellType.NUMERIC)
					System.out.println(c.getNumericCellValue());
				else if(c.getCellTypeEnum()==CellType.BOOLEAN)
					System.out.println(c.getBooleanCellValue());
			}
		}
		
		
	}

}
