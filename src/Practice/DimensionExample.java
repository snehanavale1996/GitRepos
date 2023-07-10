package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DimensionExample {

	public static void main(String[] args) {

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		Dimension di = new Dimension(300, 400);
		driver.manage().window().setSize(di);
		
		Point poi = new Point(400, 500);
		driver.manage().window().setPosition(poi);
	}

}
