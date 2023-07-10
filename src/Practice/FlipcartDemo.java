package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipcartDemo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		/*WebElement data = driver.findElement(By.name("q"));
		data.sendKeys("iphone13");
		data.submit();
		
		Thread.sleep(1000);
		WebElement data1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']"
				+ "/ancestor::div[@class='_3pLy-c row']"
				+  "/descendant::div[text()='₹61,999']"));
		String value = data1.getText();
		System.out.println(value);*/
		
		//getTagName
		/*WebElement val = driver.findElement(By.className("_396cs4"));
        String data = val.getTagName();	
        System.out.println(data);
        
       WebElement val1 = driver.findElement(By.className("xtXmba"));
       String data1 = val1.getTagName();
       System.out.println(data1);*/
		
		//getAttribute()
		WebElement data = driver.findElement(By.className("xtXmba"));
		String val = data.getAttribute("class");
		System.out.println(val);
		
		WebElement data1 = driver.findElement(By.name("q"));
		String val1 = data1.getAttribute("class");
		System.out.println(val1);
       
		WebElement data2 = driver.findElement(By.name("q"));
		String val2 = data2.getAttribute("type");
		System.out.println(val2);
       
		WebElement data3 = driver.findElement(By.className("_2xm1JU"));
		String val3 = data3.getAttribute("title");
		System.out.println(val3);
       
       
       
       
       
       
       
       
       
       
	}

}
