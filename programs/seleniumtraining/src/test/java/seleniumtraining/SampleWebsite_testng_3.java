package seleniumtraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleWebsite_testng_3 {
@Test(priority=1)
  public void verifyTitle() {
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
  
@Test(priority=2)
  public void openRegistration() {
	  System.out.println("openRegistration");
	  System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/register.html";					
	    driver.get(baseUrl);
	    
	    WebElement pageTitle = driver.findElement(By.tagName("h1"));
	    String actualTitle = pageTitle.getText();
	    String expectedTitle = "Sign Up";      
	    Assert.assertEquals(actualTitle, expectedTitle);
	    driver.close();
  }
@Test(priority=3)
public void register() {
	  System.out.println("openRegistration");
	  System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/register.html";					
	    driver.get(baseUrl);
	    
	    WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("raghu");
        
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("prasadraghuks@gmail.com");
        WebElement mobile = driver.findElement(By.id("mobile"));
        mobile.sendKeys("9845547471");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("test@123");
        
        WebElement gender = driver.findElement(By.id("female"));
        gender.click();
        
        WebElement ug = driver.findElement(By.id("ug"));
        ug.click();
        
        WebElement pg = driver.findElement(By.id("pg"));
        pg.click();
        
        
        WebElement dob = driver.findElement(By.id("bob"));
        dob.sendKeys("01-01-2000");
        
        Select loc = new Select(driver.findElement(By.id("location")));
        loc.selectByVisibleText("Hubli");
        
        driver.findElement(By.id("additonal")).sendKeys("nil");
        
        WebElement btn = driver.findElement(By.xpath("/html/body/div/form/input[11]"));
        btn.click();
        
        WebElement pageTitle = driver.findElement(By.tagName("h1"));
	    String actualTitle = pageTitle.getText();
	    String expectedTitle = "Registration successful";      
	    Assert.assertEquals(actualTitle, expectedTitle);
	    driver.close();
	    }

@Test(priority=4)
public void loginValid() {
	  System.out.println("openRegistration");
	  System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/login.html";					
	    driver.get(baseUrl);
	    
	    driver.findElement(By.id("email")).sendKeys("testuser1@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("test@123");
	    driver.findElement(By.tagName("button")).click();
	    
	    String actualMessage = driver.switchTo().alert().getText();	    
	    String expectedMessage = "valid user";      
	    Assert.assertEquals(actualMessage, expectedMessage);	    
}

@Test(priority=5)
public void loginInvalid() {
	  System.out.println("openRegistration");
	  System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
	  	WebDriver driver = new ChromeDriver();
	    String baseUrl = "https://raghuprasadks.github.io/samplewebsite/login.html";					
	    driver.get(baseUrl);
	    
	    driver.findElement(By.id("email")).sendKeys("testuser133@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("test@123");
	    driver.findElement(By.tagName("button")).click();
	    TargetLocator tl = driver.switchTo();
		Alert alt = tl.alert();
		String actualMessage =alt.getText();
		alt.accept();
	    
	    //String actualMessage = driver.switchTo().alert().getText();	    
	    String expectedMessage = "invalid user";      
	    Assert.assertEquals(actualMessage, expectedMessage);	    
}

}
