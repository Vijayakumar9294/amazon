package com.Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Runner.RunnerClass_Cucum;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition_Cucum {
	
	public WebDriver driver = RunnerClass_Cucum.driver;
	
	@Given("user Launch The Application Url")
	public void user_launch_the_application_url() {
		
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	    
	}
	@When("user Select The Value From Dropdown")
	public void user_select_the_value_from_dropdown() throws InterruptedException {
		
		WebElement dropdown = driver.findElement(By.xpath("//select [@aria-describedby='searchDropdownDescription']"));
		String expected = "Baby";
		Select s = new Select(dropdown);

		List<WebElement> options = s.getOptions();
		Thread.sleep(3000);
		for (WebElement option : options) {

			String txt = option.getText();

			if (expected.equalsIgnoreCase(txt)) {

				s.selectByVisibleText(expected);

			}else {
				continue;				
			}			
		}
		Thread.sleep(3000);
	    
	}
	@When("user Search The Product In Search Filed")
	public void user_search_the_product_in_search_filed() throws InterruptedException {
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		String value = "toys";
		searchbox.sendKeys(value);

		Thread.sleep(2000);

		List<WebElement> toys = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
		Thread.sleep(2000);
		
		for (WebElement tys : toys) {
			if(value.equalsIgnoreCase(tys.getText())) {
				tys.click();
				break;
			}
			Thread.sleep(3000);
			System.out.println("The total count is"+"="+toys.size());
			Thread.sleep(3000);
			driver.quit();
	    
	}

}
	}
	
