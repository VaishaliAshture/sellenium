package EndToEndScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnShopperstack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.name("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("ashturevaishali@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Madhav@123");
        driver.findElement(By.id("Login")).click();
        
        // to move on women web element
        WebElement women= driver.findElement(By.id("women"));
        Actions act = new Actions(driver);
        act.moveToElement(women).perform();
        
        driver.findElement(By.xpath("//a[text()='Ethnic Wear']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='foot wear']")).click();
        driver.findElement(By.xpath("//button[@name='Add To Cart']")).click();
		
	}

}
