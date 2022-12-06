package com.BaseClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass_Amazon {

	public static WebDriver driver=null;

	public static WebDriver browserLaunch(String value) {

		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse-workspace\\Mini_Projects\\DriverF\\chromedriver.exe");

			driver = new ChromeDriver();	

		}else if (value.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}else if (value.equalsIgnoreCase("gecko")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;		
	}

	public static void userInputElement(WebElement element, String Value) {
		element.sendKeys(Value);	

	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void clearOnElement(WebElement element) {
		element.clear();

	}

	public static void isSelectedElement(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println("To select the element"+selected);
	}

	public static void isDisplayedElement(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println("To displayed the element"+displayed);

	}

	public static void isEnabledElement(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println("To enable the element"+enabled);

	}

	public static void threadSleep() throws InterruptedException {
		Thread.sleep(4000);

	}

	public static String getTextElement(WebElement element) {
		String text = element.getText();
		return text;

	}

	public static void close() {
		driver.close();
	}

	public static void currentUrl(String Value) {
		driver.getCurrentUrl();
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	
	public static void navigateBack() {
		driver.navigate().back();

	}
	
	public static void navigateForward() {
		driver.navigate().forward();

	}
	
	public static void navigateRefresh() {
		driver.navigate().refresh();

	}
	
	public static void quit() {
		driver.quit();
	}
}
