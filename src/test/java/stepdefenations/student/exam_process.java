package stepdefenations.student;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driver.DriverFactory;
import Functions.Alert_functions;
import io.cucumber.java.en.When;

public class exam_process extends DriverFactory {

	
	
	
	@When("On Exam Page Select option and save")
	public void on_exam_page_select_option_a() throws InterruptedException 
	{
		Thread.sleep(3000);
		Alert_functions.alert();// for handling warning alert
		
		
		
		List<WebElement> option=driver.findElements(By.name("option"));
		Random ran = new Random(); // random function 
        
	
	  for(int i=0;i<39;i++)
		{
		  
		  int ind = ran.nextInt(option.size());  // for selecting random options
		  option.get(ind).click();
		  
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Save & Next']")).click();
		Thread.sleep(2000);
		}
	  
	  }

	

	@When("On last question click End Exam")
	public void on_last_question_click_end_exam() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='optionb']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='End Exam']")).click();
		Thread.sleep(3000);
	    
	}

	@When("click yes to end exam")
	public void click_yes_to_end_exam() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='button'][normalize-space()='End Exam']")).click();
		Thread.sleep(1000);
	  
	}

	@When("click Final end exam")
	public void click_final_end_exam() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		Thread.sleep(1000);
	   
	}
	
}
