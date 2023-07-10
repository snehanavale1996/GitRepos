package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleElement {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	int count=0;
	for(WebElement WebEle:alllinks)
	{
		System.out.println(WebEle.getText());
		count++;
	}
	System.out.println(" Total no of links :"+count);
		

	}

}
