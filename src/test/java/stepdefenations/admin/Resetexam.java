package stepdefenations.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Driver.DriverFactory;
import io.cucumber.java.en.Then;

public class Resetexam extends DriverFactory {

	
	@Then("click Reset Exam Link")
	public void click_reset_exam_link() throws InterruptedException {
		
driver.findElement(By.xpath("//a[normalize-space()='End/Reset Facilities']")).click();
Thread.sleep(3000);

	   
	}

	@Then("Open Reset exam")
	public void open_reset_exam() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[normalize-space()='Reset Examination']")).click();
		Thread.sleep(3000);
	}

	@Then("Enter Enrollment")
	public void enter_enrollment() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='enrollno']")).sendKeys("74318");
		Thread.sleep(3000);
	}

	@Then("Select Subject")
	public void select_subject() throws InterruptedException {
		Select paper=new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/main/div/div/div/div/form/div/div[2]/div[2]/div/div[2]/select")));
		Thread.sleep(3000);
		paper.selectByIndex(1);
		Thread.sleep(3000);
		
	    
	}

	@Then("Click Reset Exam")
	public void click_reset_exam() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(3000);
	}
}
