package mock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		// to scroll unto particular web element
		WebElement scrollTill = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
	    scrollTill.click();
	   // to close the parent browser
	   // String parentHandle= driver.getWindowHandle();
       // System.out.println(parentHandle);
        driver.close();
        
     
        
        
        

	}

}
