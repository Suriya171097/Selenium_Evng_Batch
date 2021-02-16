package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Demo\\Selenium_EvngBatch\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // up casting

		driver.get("https://www.amazon.in/");

	}

}
