package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
	public static void main(String[] args) {
		// to launch browser
		WebDriver driver = new ChromeDriver();
		// to launch web application
		driver.get("https://www.shoppersstack.com/");
		
	} 

}
