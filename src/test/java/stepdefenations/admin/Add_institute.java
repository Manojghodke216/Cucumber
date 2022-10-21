package stepdefenations.admin;

import org.openqa.selenium.By;

import Driver.DriverFactory;
import io.cucumber.java.en.*;

public class Add_institute extends DriverFactory {
	
	
	@When("On Admin Home Page Click Exam Configuartions")
	public void on_admin_home_page_click_exam_configuartions() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[normalize-space()='Exam Configurations']")).click();
		Thread.sleep(1000);
	    
	}
	@Then("Click On Add Institute")
	public void click_on_add_institute() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[normalize-space()='Add Institutes']")).click();
		Thread.sleep(1000);
	    
	}
	@Then("Select User Type")
	public void select_user_type() {
		
		driver.findElement(By.xpath("//select[@id='regType']")).click();
	   
	}
	@Then("Enter Username For Institute")
	public void enter_username_for_institute() {
		
		driver.findElement(By.xpath("//input[@id='controllerName']")).sendKeys("1111");
	   
	}
	@Then("Enter Name Of Institute")
	public void enter_name_of_institute() {
		
		driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("Testing");
	  
	}
	@Then("Select Region")
	public void select_region() {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/main/div/div/div/div[1]/form/div/div[2]/div[4]/div/div[2]/select/option[2]")).click();
		
	    
	}
	@Then("Enter Email Id For Institute")
	public void enter_email_id_for_institute() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("D@Gmail.com");
	    
	}
	@Then("Enter Mobile Number For The Institute")
	public void enter_mobile_number_for_the_institute() {
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8654563774");
	   
	}
	@Then("Enter Password For Your Institute")
	public void enter_password_for_your_institute() {
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
	    
	}
	@Then("Click Submit")
	public void click_submit() {
		
		driver.findElement(By.xpath("//form[@id='form-GCA']//div[@class='card mb-4']//button[@type='submit'][normalize-space()='Submit']")).click();
	    
	}


}
