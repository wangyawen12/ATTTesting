package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ATT {
	
	 WebDriver driver;
	   String baseURL;
	
	
	
  @Test
  public void f() {


	  driver.get(baseURL);
	  WebElement log = driver.findElement(By.xpath("//a[@id='z1-profile-cta']"));
		
	  log.click();;
			
		WebElement email = driver.findElement(By.id("userName"));	
		email.sendKeys("harrykjg87");
	
//		WebElement password = driver.findElement(By.id("password"));	
//		password.sendKeys("Harryk123123");
//	  

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Harryk123123");
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
	  
		WebElement select = driver.findElement(By.id("desgMainCTN_N"));
		select.click();
	    
		driver.findElement(By.xpath("//div[@id='continue']")).click();
		
		
		driver.findElement(By.xpath("//button[@ng-repeat='button in viewModel.buttons']")).click();
		driver.findElement(By.id("tab1")).click();
	
		List<WebElement> list = driver.findElements(By.className("ng-binding"));
		
		for(int i = 0; i< list.size(); i++) {
			System.out.print(list.get(i).getText());
		}
		
		
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	     System.setProperty("webdriver.chrome.driver", "/Users/yawenwang/Documents/workspace/selenium/chromedriver");
		 driver = new ChromeDriver();
		
		 baseURL = "https://www.att.com/";
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  
  }

  @AfterTest
  public void afterTest() {
  }

}
