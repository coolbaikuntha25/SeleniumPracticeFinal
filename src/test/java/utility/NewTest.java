package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\bknth\\git\\SeleniumPracticeFinal\\driver\\chromedriver119.exe");
				WebDriver driver = new ChromeDriver();
				
				String baseURL = "https://courses.letskodeit.com/practice";
				driver.manage().window().maximize();
				driver.get(baseURL);
				
				driver.findElement(By.tagName("a")).click();
				//Test
  }
}
