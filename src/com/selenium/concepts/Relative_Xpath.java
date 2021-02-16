package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Demo\\Selenium_EvngBatch\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));

		email.sendKeys("Abc@gmail.com");

		WebElement password = driver.findElement(By.xpath
				("(//input[contains(@data-testid,'royal')])[2]"));
		password.sendKeys("Abc");

		WebElement create_Txt = driver.findElement
				(By.xpath("//a[text()='Create a Page']"));

		String text = create_Txt.getText();
		System.out.println("Text : " + text);

		WebElement facebook_Txt = driver.findElement
				(By.xpath("//h2[contains(text(),'Face')]"));
		String text2 = facebook_Txt.getText();
		System.out.println("Text: " + text2);

		WebElement login_Btn = driver.findElement
				(By.xpath("//button[contains(@data-testid,'royal')]"));
		login_Btn.click();

		driver.quit();
		
		
		
	}

}
