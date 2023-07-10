package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://username:password@Url");(syntax)
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
