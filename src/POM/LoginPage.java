package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage(WebDriver driver)
	
	{
	  PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usertextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;

	public WebElement getUsertextfield() {
		return usertextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void logintoapp(String username,String password)
	{
		usertextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		loginbutton.click();
	}
}
