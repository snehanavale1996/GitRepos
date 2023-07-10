package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathContains {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,'textField p')]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Vie')]")).click();
		//driver.findElement(By.xpath("//a[contains(.(),'Vie')]")).click();
		
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("manager");
		driver.findElement(By.xpath("//button[contains(@class,'_42')]")).click();*/
		
		
	}

}
