package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalenderPopup {

	public static void main(String[] args) {

		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[text()='May 2023']"));
		driver.findElement(By.xpath("//div[text()='May 2023']"
				+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='8']")).click();*/
		
		driver.findElement(By.xpath("(//span[@class='chNavText darkGreyText'])[2]")).click();
		driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
		driver.findElement(By.xpath("//label[@for='city']")).click();
		driver.findElement(By.xpath("(//p[@class='font12 grayText appendBottom3'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='12'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='20'])[1]")).click();
		driver.findElement(By.xpath("//span[@data-testid='room_count']")).click();
	    driver.findElement(By.xpath("//li[@data-testid='gstSlct__listItem-2']")).click();
	    driver.findElement(By.xpath("//span[@data-testid='adult_count']")).click();
	    driver.findElement(By.xpath("//li[@data-testid='gstSlct__listItem-4']")).click();
	    driver.findElement(By.xpath("(//span[@class='gstSlct__text'])[3]")).click();
	    driver.findElement(By.xpath("//li[@data-testid='gstSlct__listItem-2']")).click();
	    
		
		//driver.get("https://www.booking.com/");
		
		
	}

}
