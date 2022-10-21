package stepdefenations.student;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Driver.DriverFactory;
import io.cucumber.java.en.*;

public class student_exam extends DriverFactory {
	
	@When("search subject and enter")
	public void search_subject_and_enter() throws InterruptedException {
		
		

		driver.findElement(By.xpath("//input[@id='searchSubject']")).sendKeys("11044");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='svg-inline--fa fa-search fa-w-16']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	    
	}

	@Then("click proceed")
	public void click_proceed() throws InterruptedException {
		Thread.sleep(3000);
		
		List<WebElement> web= driver.findElements(By.xpath("//a[text()='Resume']"));
	
		
		Thread.sleep(3000);
		
		if(web.size()!=0)
		{
		   driver.findElement(By.xpath("//a[text()='Resume']")).click();
		
		Thread.sleep(3000);
		}
		else 
		{Thread.sleep(3000);
		System.out.println(98);
             driver.findElement(By.linkText("Proceed")).click();
		
		Thread.sleep(3000);
		}
	}
	
	
	@Then("check instructions")
	public void check_instructions() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@id='read']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("continue exam")
	public void continue_exam() throws InterruptedException {
		Thread.sleep(3000);
		
		List<WebElement> web1= driver.findElements(By.xpath("//button[normalize-space()='Continue Exam']"));
		
		Thread.sleep(3000);
		
		if(web1.size()!=0)
		{
		driver.findElement(By.xpath("//button[normalize-space()='Continue Exam']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Okay Noted']")).click();
		Thread.sleep(3000);
		
		}
		else 
			
		{
			
			System.out.println(98);
			driver.findElement(By.xpath("//button[normalize-space()='Start Exam']")).click();
			Thread.sleep(3000);
		}
	}

	
	
	
	
	

}
