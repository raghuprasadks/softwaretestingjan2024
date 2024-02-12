package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void openSampleWebsite() {
	  System.out.println("verifyTitle");
		System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/";					
	    driver.get(baseUrl);
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Test Automation Practice Web Site";      
	    Assert.assertEquals(actualTitle, expectedTitle);
	    driver.close();
  
  }
}
