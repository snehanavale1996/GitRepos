package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
		
		/*driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		//  Xpath by Attribute
		//  //htmltag[@Attribute name = 'Attribute value']
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//Xpath by visible Text
		//  //htmltag[text()='visibleText']
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Lock Time-Track']")).click();*/
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();

	}

}
