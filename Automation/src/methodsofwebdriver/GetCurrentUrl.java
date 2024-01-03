package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
         public static void main(String[] args) {
        	 // to open the browser
    WebDriver driver = new ChromeDriver();
    // to maximize browser
    driver.manage().window().maximize();
    // to launch web page
    driver.get("https://www.flipkart.com/");
    // to get the current url
    String url = driver.getCurrentUrl();
    System.out.println("The url of flipkart is:"+url);
    
			
		}


}
