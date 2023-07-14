package datadrivenframework.ddf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class day6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\datadriven\\data1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("sheet2");
		Row r=null;
		Cell c=null;
		r=s.createRow(0);
		r.createCell(0).setCellValue("Automation");
		r=s.createRow(1);
		r.createCell(0).setCellValue("manual Testing");
		r=s.createRow(2);
		r.createCell(0).setCellValue("Testng");
		r=s.createRow(3);
		r.createCell(0).setCellValue("DataDriven Framework");
		r=s.createRow(4);
		r.createCell(0).setCellValue("Keyword Driven Framework");
		r=s.createRow(5);
		r.createCell(0).setCellValue("POM Framework");
		FileOutputStream f1=new FileOutputStream("D:\\datadriven\\data1.xlsx");
		w.write(f1);
		w.close();
		f1.close();

	}

}
