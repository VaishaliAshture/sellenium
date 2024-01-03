package assignmentOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrlOfZomato {
	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			// to launch zomato application
			driver.get("https://www.zomato.com/");
			
			// to get current url
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			// to fetch current title
			String titleofzomatopage = driver.getTitle();
			System.out.println(titleofzomatopage);
			
			// to close browser
			driver.quit();

	}

}
