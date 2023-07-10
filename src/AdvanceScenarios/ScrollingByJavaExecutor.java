package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingByJavaExecutor {

	public static void main(String[] args) throws Throwable  {

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<6;i++)
		{
			js.executeScript("window.scrollBy(0,800)" );
			Thread.sleep(1000);
		}
		for(int i=0;i<4;i++)
		{
			js.executeScript("window.scrollBy(0,-800)" );
			Thread.sleep(1000);
		}
	}

}
