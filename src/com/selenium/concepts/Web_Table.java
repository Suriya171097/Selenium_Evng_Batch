package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Eclipse\\Demo\\Selenium_EvngBatch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get
		("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		driver.manage().window().maximize();
		
		// all data
		
		System.out.println("************ALL DATA***************");
		
		List<WebElement> all_Data = driver.findElements
				(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement data : all_Data) {
			
			String values = data.getText();
			
			System.out.println(values);
			
		}
		
		// size 
		
		int size = all_Data.size();
		System.out.println("Size : "+size);
		
		System.out.println("*********ROW DATA*************");
		
		List<WebElement> row_Data = driver.findElements
				(By.xpath("//table/tbody/tr[3]/td"));
		
		for (int i = 0; i < row_Data.size(); i++) {
			
			String value = row_Data.get(i).getText();
			
			System.out.println(value);
			
		}
		
		// task ->  Get a one particular  column data 
		
		// task 2 -> 2008/11/28 -> get a position
		
		
	}

}
