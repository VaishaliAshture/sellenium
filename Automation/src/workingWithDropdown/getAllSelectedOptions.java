package workingWithDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
     WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		
		//to identify the dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		
		//to create the object of select class
		Select s = new Select(dropdown);
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
	List<WebElement> allselectedoptions = s.getAllSelectedOptions();
	
	for(WebElement option:allselectedoptions)
	{
		System.out.println(option.getText());
	}
	
	}

}
