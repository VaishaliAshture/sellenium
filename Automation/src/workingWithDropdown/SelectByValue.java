package workingWithDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapps.qspiders.com/dropdown/multiselect?sublist=1");
			
			WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
			
			Select s = new Select(dropdown);
		
				s.selectByValue("India");
				
				s.selectByValue("Canada");
	}

}
