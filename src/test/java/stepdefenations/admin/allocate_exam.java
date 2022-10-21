package stepdefenations.admin;

import org.openqa.selenium.By;

import Driver.DriverFactory;
import io.cucumber.java.en.Then;

public class allocate_exam extends DriverFactory {

	
	
	@Then("Click Allocation Link")
	public void click_allocation_link() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[normalize-space()='Allocations']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("Open Student Subject Allocation")
	public void open_student_subject_allocation() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[normalize-space()='Stud Subject Alloc']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("Enter Student Enrollment")
	public void enter_student_enrollment() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='enrollno']")).sendKeys("907010090");
		Thread.sleep(3000);
	    
	}

	@Then("Select Subject for allocation")
	public void select_subject_for_allocation() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/main/div/div/div/div[2]/div/form/div/div[2]/div[2]/div/div[2]/div[1]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='react-select-2-option-0']")).click();
		Thread.sleep(3000);
	  
	}

	@Then("Click Allocate Exam")
	public void click_allocate_exam() {
		driver.findElement(By.xpath("//form[@id='form-Prog']//button[@type='submit'][normalize-space()='Submit']")).click();
	    
	}

}
