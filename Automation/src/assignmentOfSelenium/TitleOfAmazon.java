package assignmentOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfAmazon {
	
		public static void main(String[] args) {
			// to launch browser
			WebDriver driver = new ChromeDriver();
			// to maximize browser
			driver.manage().window().maximize();
			// to launch web application
			driver.get("https://www.amazon.in/");
			// to fetch the title of current web page
			String actual_title = driver.getTitle();
			// System.out.println(title of current web page);
			if (actual_title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
			{
				System.out.println("Test case is pass");
			}
			else
			{
				System.out.println("Test case is fail");
			}
		}
	}



