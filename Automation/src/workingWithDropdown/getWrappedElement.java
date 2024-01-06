package workingWithDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
			
			//to identify the dropdown
			WebElement dropdown = driver.findElement(By.id("select3"));
			
			//to create the object of select class
			Select s = new Select(dropdown);
			
		    WebElement alloptions = s.getWrappedElement();
		    
		    System.out.println((alloptions).getText());

	}

}
