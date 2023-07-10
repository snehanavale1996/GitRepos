package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FilpcartLaunchApp {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
		FileInputStream fis= new FileInputStream("./Filedata.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url1");
		driver.get(URL);
		
	}

}
