package com.slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitleMethod {
	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();
		// to maximize browser
		driver.manage().window().maximize();
		// to launch web application
		driver.get("https://www.flipkart.com/");
		// to fetch the title of current web page
		String actual_title = driver.getTitle();
		// System.out.println(title of current web page);
		if (actual_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!"))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
	}

}
