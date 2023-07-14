package datadrivenframework.ddf;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class day2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p =new Properties();
		p.setProperty("Name", "AAAAAA");
		p.setProperty("roolno", "1234");
		p.store(new FileWriter("xx"), null);
		FileReader r= new FileReader("C:\\Users\\sekhar\\eclipse-workspace\\WebDriver3\\ddf\\xx");
		Properties p1 =new Properties();
		p1.load(r);
		System.out.println(p1.getProperty("Name"));
		System.out.println(p1.getProperty("roolno"));
	}

}
