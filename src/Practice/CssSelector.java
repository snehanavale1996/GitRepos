package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//using cssSelector() by id()
		//using [Attribute name=Attribute value]
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		
		// using html{[Attribute name=Attribute value]
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	
		//using cssSelector() by name
		//using [Attribute name=Attribute value]
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		// using html{[Attribute name=Attribute value]
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		
		
		driver.findElement(By.cssSelector("#loginButton ")).click();
		
		
	}

}
