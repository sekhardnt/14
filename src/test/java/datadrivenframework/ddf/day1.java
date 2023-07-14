package datadrivenframework.ddf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class day1 {

	public static void main(String[] args) throws IOException {
		FileInputStream f= new FileInputStream("C:\\Users\\sekhar\\eclipse-workspace\\WebDriver3\\ddf\\config.properties");
		Properties p= new Properties();
		p.load(f);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("batch"));
	}

}
