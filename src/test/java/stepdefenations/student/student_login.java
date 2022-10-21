package stepdefenations.student;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import Driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;



public class student_login extends DriverFactory {


	

	@Given("Browser")
	public void browser() {
		driver = getbrowser();
		driver.manage().window().maximize();



	}



	@Given("Link")
	public void link() throws InterruptedException  
	{
		driver.get("https://msbte.gudexams.com/");	
		Thread.sleep(1000);

	}

	@When("^Enter(.*) and(.*)$")
	public void enter_username_and_password(String username, String password) throws InterruptedException 
	{


		String u1=username.trim();		
		driver.findElement(By.id("username")).sendKeys(u1);

		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);


	}


	@When("Enter Captcha")
	public  void enter_captcha() throws InterruptedException, IOException, TesseractException 
	{


		String path_stud_captcha="C:/Users/shrad/.eclipse/Cucumber/src/test/resources/captcha_images/cap.png";
		WebElement wb_stud=driver.findElement(By.xpath("//div[@class='style_captchaContainer__LdFYB']"));


		System.out.println("Encrypting the data");
		Thread.sleep(3000);
		File src_stud = wb_stud.getScreenshotAs(OutputType.FILE);



		System.out.println("Processing for image");
		FileHandler.copy(src_stud, new File(path_stud_captcha));


		ITesseract img_stud = new Tesseract();
		String value_stud=img_stud.doOCR(new File(path_stud_captcha));


		System.out.println("Decrypting the data");
		String cap1=value_stud.replaceAll("[^a-zA-Z1-9]+", "");
		String cap_stud=cap1.substring(0, 4);

		driver.findElement(By.id("captcha")).sendKeys(cap_stud);


	}

	@When("Check Privacy Policy")
	public void check_privacy_policy() throws InterruptedException 
	{
		driver.findElement(By.id("privacyCheck")).click();
		driver.findElement(By.id("cameraCheck")).click();
		Thread.sleep(3000);

	}


	@When("Click on Login")
	public void click_on_login() throws InterruptedException  
	{
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}





}
