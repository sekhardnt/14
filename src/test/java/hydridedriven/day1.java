package hydridedriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {
	WebDriver d;
	public void openingbrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
	}
	public void Firstname(String name)
	{
		d.findElement(By.name("firstName")).sendKeys(name);
	}
	
	public void Lastname(String lname)
	{
		d.findElement(By.name("lastName")).sendKeys(lname);
	}
	public void Phone(double phone)
	{
		String ph=String.valueOf(phone);
		d.findElement(By.name("phone")).sendKeys(ph);
	}
	public void Email(String email)
	{
		d.findElement(By.name("userName")).sendKeys(email);
	}
	public void Address(String address)
	{
		d.findElement(By.name("address1")).sendKeys(address);
	}
	public void City(String city)
	{
		d.findElement(By.name("city")).sendKeys(city);
	}
	public void State(String state)
	{
		d.findElement(By.name("state")).sendKeys(state);
	}
	public void Pincode(double e)
	{
		String p=String.valueOf(e);
		d.findElement(By.name("postalCode")).sendKeys(p);
	}
	public void Country(String country)
	{
		d.findElement(By.name("country")).sendKeys(country);
	}
	public void Username(String username)
	{
		d.findElement(By.name("email")).sendKeys(username);
	}
	public void Password(String pass)
	{
		d.findElement(By.name("password")).sendKeys(pass);
	}
	public void Confirmpassword(String confi)
	{
		d.findElement(By.name("confirmPassword")).sendKeys(confi);
	}
	public void Submit()
	{
		d.findElement(By.name("submit")).click();
	}

}
