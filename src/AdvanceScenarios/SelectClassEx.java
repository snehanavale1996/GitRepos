package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver=new EdgeDriver();
  
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		WebElement dateList = driver.findElement(By.id("day"));
		Select sel =new Select(dateList);
		//sel.selectByIndex(1);
		//sel.selectByValue("2");
		sel.selectByVisibleText("2");
		
		
		WebElement monthList = driver.findElement(By.id("month"));
		Select sel1=new Select(monthList);
		//sel1.selectByIndex(5);
		//sel1.selectByValue("2");
		sel1.selectByVisibleText("5");
		
		Thread.sleep(4000);
		WebElement yearList = driver.findElement(By.id("year"));
		Select sel2=new Select(yearList);
		//sel2.selectByIndex(2);
		//sel2.selectByValue("2");
		sel2.selectByVisibleText("2");
	}

}
