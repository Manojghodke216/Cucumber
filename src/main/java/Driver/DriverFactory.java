package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	protected static WebDriver driver;
	static ChromeOptions cp= new ChromeOptions();
	
	
	
	public WebDriver getbrowser()  {

		if (driver==null)
		{

			WebDriverManager.chromedriver().setup();
		}
		
		cp.addArguments("use-fake-ui-for-media-stream");
		cp.addArguments("--disable-notifications");
		return driver = new ChromeDriver(cp);


	}
}
