package regressionsuite;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Chrome {
	
	private WebDriver driver;
	private String baseURL;
  
	
	
	@Test
  public void f() {
		driver.get(baseURL);
	
	WebElement log = driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']"));
	
	log.click();;
		
	WebElement email = driver.findElement(By.id("user_email"));	
	WebElement password = driver.findElement(By.id("user_password"));	
	
	email.sendKeys("wangyawen@gmail.com");
	password.sendKeys("123");
	
	WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
	
  }
  

  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/yawenwang/Documents/workspace/selenium/chromedriver");
		driver = new ChromeDriver();
		
		
		
		 baseURL = "https://letskodeit.teachable.com/";
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
