package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleWebsite_Firefox_4 {
	
	
	@Test
    public void openRegistration() {
  	  System.out.println("openRegistration");
  	  System.setProperty("webdriver.gecko.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\geckodriver.exe");
  	  WebDriver driver = new FirefoxDriver();
  	  String baseUrl = "https://raghuprasadks.github.io/samplewebsite/register.html";					
  	  driver.get(baseUrl);
  	    
  	    WebElement pageTitle = driver.findElement(By.tagName("h1"));
  	    String actualTitle = pageTitle.getText();
  	    String expectedTitle = "Sign Up";      
  	    Assert.assertEquals(actualTitle, expectedTitle);
  	    driver.close();
    }
}
