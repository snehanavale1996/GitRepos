package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//using id locator
		driver.findElement(By.id("username")).sendKeys("admin");
		//using name locator
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.className("textField pwdfield")).sendKeys("manager");
		driver.findElement(By.className("textfield")).sendKeys("manager");
		
		//using id locator
		//driver.findElement(By.id("loginButton")).click();
		
		//using classname locator
		driver.findElement(By.className("initial")).click();
		
		//using linktest locator
		Thread.sleep(1000);
		//driver.findElement(By.linkText("View Time-Track")).click();
		
		//driver.findElement(By.linkText("Enter Time-Track")).click();
		
		//using partial linktest locator
		
		driver.findElement(By.partialLinkText("View Time-Track")).click();
	}

}