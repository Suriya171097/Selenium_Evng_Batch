package com.selenium.concepts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots_Concept {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		email.sendKeys("Abc@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Abc");

		WebElement login_Btn = driver.findElement(By.xpath("//button[text()='Log In']"));
		login_Btn.click();

		Thread.sleep(2000);

		
		TakesScreenshot ts = (TakesScreenshot) driver; // narrowing type casting
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Eclipse\\Demo\\Selenium_EvngBatch\\Snapshot\\snap.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.close();
		
		
		
		
	}

}
