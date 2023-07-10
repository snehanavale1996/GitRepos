package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd' and @placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton' or @class='initial']")).click();
	}

}
