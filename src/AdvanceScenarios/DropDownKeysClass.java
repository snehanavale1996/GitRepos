package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownKeysClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		  
        driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		/*Thread.sleep(1000);
		WebElement dateList = driver.findElement(By.xpath("//select[@id='day']"));
		dateList.click();
		dateList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		dateList.sendKeys(Keys.ARROW_DOWN);*/
		
		Thread.sleep(1000);
		WebElement monthList = driver.findElement(By.id("month"));
		monthList.click();
		monthList.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		monthList.sendKeys(Keys.ARROW_UP);
		
		/*WebElement yearList = driver.findElement(By.xpath("//select[@id='year']"));
		yearList.click();
		yearList.sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		yearList.sendKeys(Keys.ARROW_UP);*/
	}

}
