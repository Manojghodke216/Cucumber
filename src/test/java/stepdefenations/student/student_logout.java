package stepdefenations.student;

import org.openqa.selenium.By;


import Driver.DriverFactory;
import io.cucumber.java.en.Then;

public class student_logout extends DriverFactory {
	

	@Then("Once Successfull Login, Click Logout")
	public void once_successfull_login_click_logout() 
	{
		driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
	}


	@Then("Close The Browser")
	public void close_the_browser() 
	{
		driver.quit();
}

}
