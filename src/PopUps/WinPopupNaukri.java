package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WinPopupNaukri {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("naukri"))
			{
				break;
			}
		}
		Thread.sleep(2000);
		Set<String> windows1 = driver.getWindowHandles();
		for(String window:windows1)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"))
			{
				break;
			}
	}
		
	}

}
