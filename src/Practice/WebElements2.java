package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElements2 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		//isDisplayed
		/*WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else 
		{
			System.out.println("logo is not displayed");
		}*/
		
		//isEnabled
		/*WebElement data = driver.findElement(By.id("username"));
		if(data.isEnabled())
		{
		 data.sendKeys("admin");
		 
		}
		else
		{
			System.out.println(" not enabled");
		}*/
		
		//isSelected
		/*WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("checked");
		}
		else
		{
			System.out.println("NotChecked");
		}*/
		//getAttribute
		/*WebElement data = driver.findElement(By.id("username"));
		String value = data.getAttribute("id");
		System.out.println("Attribute Value of id is: "+value);
		
		WebElement data1 = driver.findElement(By.id("username"));
		String value1 = data1.getAttribute("type");
		System.out.println("Attribute Value of type is: "+value1);
		
		WebElement data2 = driver.findElement(By.name("pwd"));
		String value2 = data2.getAttribute("class");
		System.out.println("Attribute Value of class is: "+value2);*/
		
		
		//gettagname
		/*WebElement data = driver.findElement(By.id("username"));
		String value = data.getTagName();
		System.out.println(value); 
		
		WebElement data1 = driver.findElement(By.id("loginButton"));
		String val = data1.getTagName();
		System.out.println(val);*/
		
		//getArialRole
		/*WebElement data = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String val = data.getAriaRole();
		System.out.println(val);
		
		 WebElement data1 = driver.findElement(By.xpath("//div[text()='Login ']"));
		String value = data1.getAriaRole();
		System.out.println(value);
		
		WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(CheckBox.getAriaRole());
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		System.out.println(logo.getAriaRole());*/
		//getDomAttribute		this functionality is same as getAttribute
		/*WebElement data = driver.findElement(By.id("username"));
		data.sendKeys("admin");
		System.out.println(data.getDomAttribute("class"));*/
		
		//getAccessibleName()
		/*WebElement data = driver.findElement(By.id("username"));
		System.out.println(data.getAccessibleName());
		
		WebElement data1 = driver.findElement(By.name("pwd"));
		System.out.println(data1.getAccessibleName());
		
		WebElement data2 = driver.findElement(By.id("loginButton"));
		System.out.println(data2.getAccessibleName());*/
		
		
	}

}
