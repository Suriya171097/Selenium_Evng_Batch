package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Eclipse\\Demo\\Selenium_EvngBatch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // up casting
		
		// get
		
		driver.get("https://www.facebook.com/");
		
		// maximize
		
		driver.manage().window().maximize();
		
		// getTitle
		
		String title = driver.getTitle();
		System.out.println(title);

		// currentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		// navigation - to
		
		driver.navigate().to("https://www.amazon.in/");
		
		// back
		driver.navigate().back();
		
		// forward
		
		driver.navigate().forward();
		
		// refresh
		driver.navigate().refresh();
		
		// quit
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
