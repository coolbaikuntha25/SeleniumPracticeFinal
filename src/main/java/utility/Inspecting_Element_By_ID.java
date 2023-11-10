package utility;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Inspecting_Element_By_ID {
	
	// Chrome - ctrl + f => Get option to search DOM
	// Selector HUB - Installation 
	
	public static void main(String[] args) {
		String baseURL = "https://learn.letskodeit.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");
	}
}
