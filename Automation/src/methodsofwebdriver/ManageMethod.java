package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) {
		//to launch browser
		WebDriver driver = new ChromeDriver();
		// to maximize window
		driver.manage().window().maximize();
	    // to open web application
		driver.get("https://www.shoppersstack.com/");
	}
}
