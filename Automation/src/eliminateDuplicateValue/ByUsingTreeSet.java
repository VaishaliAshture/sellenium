package eliminateDuplicateValue;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByUsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/msate/Desktop/Dropdwn.html.HTML");
		
		WebElement dropdown = driver.findElement(By.id("Movies"));
		
		Select s = new Select(dropdown);
		
		List<WebElement> allDuplicteOptions = s.getOptions();
		
		TreeSet<String> set = new TreeSet<String>();
		
		for(int i=0;i<allDuplicteOptions.size();i++)
		{
			String allOptions = allDuplicteOptions.get(i).getText();
			set.add(allOptions);
		
		}

		for(String Option:set)
		{
			System.out.println(Option);
		}
	}

}
