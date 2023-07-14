package datadrivenframework.ddf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		FileInputStream f= new FileInputStream("D:\\datadriven\\data1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		XSSFSheet s=w.getSheet("sheet3");
		Row r=null;
		Cell c=null;
		WebElement ele=d.findElement(By.name("country"));
		List<WebElement> li=ele.findElements(By.tagName("option"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
			r=s.createRow(i);
			r.createCell(0).setCellValue(li.get(i).getText());
			li.get(i).click();
			if(i%2==0) 
			r.createCell(1).setCellValue("Passed");
			else
			r.createCell(1).setCellValue("Failed");
				
		}
		FileOutputStream f1=new FileOutputStream("D:\\datadriven\\data1.xlsx");
		w.write(f1);
		w.close();
		f1.close();
	}

}
