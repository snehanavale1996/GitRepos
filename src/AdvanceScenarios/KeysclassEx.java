package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class KeysclassEx {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("username")).sendKeys("admin");
		WebElement data = driver.findElement(By.name("pwd"));
		data.sendKeys("manager");
		data.sendKeys(Keys.ENTER);
		
		
		WebElement data = driver.findElement(By.name("pwd"));
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);*/
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		
	}

}
