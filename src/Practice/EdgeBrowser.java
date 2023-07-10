package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
      //Launching empty edgebrowser
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=pmax_cpc&utm_campaign=dms_google_pmax_cpc_Myntra_PMax_SOK_KPI_Traffic&keyword");
		
		//String data = driver.getTitle();
		//System.out.println(data);
		
		//driver.close();
		//driver.quit();
		//String URL=driver.getCurrentUrl();
		//System.out.println(URL);
		//String data = driver.getPageSource();
		//System.out.println(data);
		
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		
	}

}
