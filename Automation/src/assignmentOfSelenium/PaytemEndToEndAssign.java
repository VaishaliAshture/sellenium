package assignmentOfSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class PaytemEndToEndAssign {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		// //h1[text()='Book & Buy on Paytm.']
		WebElement scrollTill = driver.findElement(By.xpath("//h1[text()='Book & Buy on Paytm.']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",scrollTill);
		
		driver.findElement(By.
				xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		
		// entering the value inside from text field
		driver.findElement(By.id("srcCode")).click();
		//to click on cross button
		driver.findElement(By.className("_3i2Wp")).click();
		// to enter value
		driver.findElement(By.id("text-box")).sendKeys("PNQ");
		// to click on value
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		Thread.sleep(4000);
		// entering value inside to text box
		driver.findElement(By.id("destCode")).click();
		driver.findElement(By.className("_3i2Wp")).click();
		driver.findElement(By.id("text-box")).sendKeys("Del");
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		// to select the departure date
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("(//div[text()='20'])[1]")).click();
		// to select  add returns date
		driver.findElement(By.id("addReturn")).click();
		driver.findElement(By.xpath("(//div[text()='26'])[1]")).click();
		
		// to click on cabin class
		driver.findElement(By.id("numPax")).click();
		
		// select 4 adluts
		for(int i=0; i< 2; i++)
		{
			// to click on plus icon
			driver.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
			Thread.sleep(2000);
		}
		
		// to click on search flight button
		driver.findElement(By.id("flightSearch")).click();
		
		// all the flight in your console
		List<WebElement> allFlights = driver.findElements(By.xpath("(//div[@class='tmJfo onwardflightCard'])[14]"));
		
		for(WebElement flight:allFlights)
		{
			System.out.println(flight.getText());
			System.out.println("---------------------------------------------");
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/flights.png");
		Files.copy(src, dest);
	}

}
