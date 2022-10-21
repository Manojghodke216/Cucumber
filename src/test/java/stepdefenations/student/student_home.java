package stepdefenations.student;

import org.openqa.selenium.By;

import Driver.DriverFactory;
import io.cucumber.java.en.*;

public class student_home extends DriverFactory {
	
	
	
	
	
	@Then("click on ALL")
	public void click_on_all() throws InterruptedException {
		
		driver.findElement(By.xpath("//center[normalize-space()='All']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("click on Yet To Start")
	public void click_on_yet_to_start() throws InterruptedException {
		driver.findElement(By.xpath("//center[normalize-space()='Yet To Start']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("Click on Resume")
	public void click_on_resume() throws InterruptedException {
		driver.findElement(By.xpath("//center[normalize-space()='Resume']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("Click on Completed")
	public void click_on_completed() throws InterruptedException {
		driver.findElement(By.xpath("//center[normalize-space()='Completed']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("Click on Absent")
	public void click_on_absent() throws InterruptedException {
		driver.findElement(By.xpath("//center[normalize-space()='Absent']")).click();
		Thread.sleep(3000);
	   
	}


}
