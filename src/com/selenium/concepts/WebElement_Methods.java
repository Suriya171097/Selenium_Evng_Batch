package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Demo\\Selenium_EvngBatch\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		// is Enabled

		boolean enabled = email.isEnabled();
		System.out.println("Enabled or not : " + enabled);

		// is Displayed
		boolean displayed = email.isDisplayed();
		System.out.println("Displayed Or Not : " + displayed);

		// send keys
		email.sendKeys("Abc@gmail.com");

		// get Attribute -> value

		String passed_Input = email.getAttribute("value");
		System.out.println("Passed Data : " + passed_Input);

		// get Attribute ->

		String attribute_Name = email.getAttribute("id");
		System.out.println("Attribute name : " + attribute_Name);

		// clear

		email.clear();

		// send keys
		email.sendKeys("xyz@gmail.com");
		
		
		WebElement create_Txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));

		// getText
		String text = create_Txt.getText();

		System.out.println("Text : " + text);


		WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		// click
		create_Btn.click();
		
		Thread.sleep(3000);
		
		WebElement gender_Btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		//gender_Btn.click();
		
		// is Selected
		
		boolean selected = gender_Btn.isSelected();
		System.out.println("Selected or not : "+selected);
		
	}

}
