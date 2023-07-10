package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Bluetooth");
		List<WebElement> AllList = driver.findElements(By.tagName("li"));
		Thread.sleep(2000);
		for(WebElement list:AllList)
		{
		if(list.getText().contains("bluetooth speaker"))
		{
			System.out.println(list.getText());
			Thread.sleep(1000);
			list.click();
			break;
		}
		}
		
	}

}
