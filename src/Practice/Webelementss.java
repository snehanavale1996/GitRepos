package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Webelementss {

	public static void main(String[] args) throws Throwable {
   //Webelements using cssvalue()

		WebDriver driver=new EdgeDriver();

		//driver.get("https://www.facebook.com/");
		/*//finding font-size of facebook logo
		WebElement font = driver.findElement(By.xpath("//img[contains(@class,'f')]"));
		String data = font.getCssValue("font-size");
		System.out.println(data);
		//finding colour of email text box
		WebElement color = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		String data1 = color.getCssValue("color");
		System.out.println(data1);*/
		
		//Webelements using sendkeys(), submit()
		
	/*	driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement value = driver.findElement(By.name("q"));
		value.sendKeys("puma");
		value.submit();*/
		
		/*driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.cssSelector("input#username"));
		username.sendKeys("admin");
		Thread.sleep(1000);
		username.clear();*/
		
		//getlocation
		/*driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement data = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Point location = data.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		System.out.println(location);
		
		
		WebElement data1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Point val = data1.getLocation();
		System.out.println(val);
		
		//getsize()
		WebElement data2 = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")); 
		Dimension value = data2.getSize();
		System.out.println(value.getHeight());
		System.out.println(value.getWidth());
		System.out.println(value);
		
		//getrect()
		WebElement data3 = driver.findElement(By.xpath("//img[contains(@class,'f')]"));
		Rectangle rec = data3.getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getHeight());
		System.out.println(rec.getWidth());
		System.out.println(rec);*/
		
		
		
		
		
		
	}

}
