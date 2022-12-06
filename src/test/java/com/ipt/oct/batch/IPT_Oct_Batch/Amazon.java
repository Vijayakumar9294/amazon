package com.ipt.oct.batch.IPT_Oct_Batch;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.BaseClass_Amazon;

public class Amazon {
	
	//public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\Amazon_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

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

		WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
		String value = "toys";
		searchbox.sendKeys("toys");
		String attribute = searchbox.getAttribute(value);

		Thread.sleep(4000);

		List<WebElement> toys = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	
		
		for (int i = 0; i < toys.size(); i++) {
			Thread.sleep(2000);
			String texttoy = toys.get(i).getText();
			System.out.println(texttoy);
			if (texttoy.equalsIgnoreCase(value)) {
				toys.get(i).click();
				break;
			}
		}
		
			Thread.sleep(3000);
			System.out.println("The total count is"+"="+toys.size());
			Thread.sleep(3000);
			driver.quit();
		}	
	}



