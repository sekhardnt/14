package keyworddrivenframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

	WebDriver d;
	
	public void Opening_Bowser()
	{
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.manage().window().maximize();
	}
	
	public void Navigate_google()
	{
		d.get("https://www.google.com");
	}
	
	public void Text_box()
	{
		d.findElement(By.name("q")).sendKeys("Automation");
	}
	public void Search() throws InterruptedException
	{
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	public void Close()
	{
		d.close();
	}
	
}
