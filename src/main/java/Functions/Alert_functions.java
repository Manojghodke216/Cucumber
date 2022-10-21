package Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driver.DriverFactory;

public class Alert_functions extends DriverFactory {
	


	public static void alert() {
		
		  List<WebElement> alert_window=driver.findElements(By.xpath("/html/body/div[4]/div/div/div[1]"));
		  List<WebElement> ok_noted=driver.findElements(By.xpath("//button[text()='Okay Noted']"));
		  List<WebElement> close=driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/button"));
		
		if(alert_window.size() !=0)
		{
			
		
		if(ok_noted.size() !=0)
		{
			driver.findElement(By.xpath("//button[text()='Okay Noted']"));
			
			
			
		}
		else if(close.size() !=0)
		{
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/button"));
			
		}
		
		}
		
	
	
	
	}
	
	
	
	
	}
	

