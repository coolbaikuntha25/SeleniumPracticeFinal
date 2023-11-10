package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inspecting_Element_Using_LinkTxt_or_PartialLinkTxt {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", 
		//		"/Users/atomar/Documents/workspace_personal/libs/geckodriver");
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String baseURL = "https://courses.letskodeit.com/practice";
		driver.get(baseURL);
		
		driver.findElement(By.linkText("ALL COURSES")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("")).click();

	}

}
