package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue= {"stepdefenations.admin","stepdefenations.student"},
tags="@Admin or @Student or @Regression",
dryRun = false, // make it true when you want to check if step defenations are writtten for every step, its like compiler
//tags="@Exam_Configuarions",
monochrome=true, 
plugin= {"pretty","html:target/HtmlReports", 
"json:target/cucumber.json",
})


public class Login_runners 
{ 

}