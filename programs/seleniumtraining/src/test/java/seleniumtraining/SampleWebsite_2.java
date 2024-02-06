package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebsite_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://raghuprasadks.github.io/samplewebsite/";					
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("title is "+title);
        WebElement link =driver.findElement(By.linkText("Register"));
        link.click();
        
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("raghu");
        
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("prasadraghuks@gmail.com");
        WebElement mobile = driver.findElement(By.id("mobile"));
        mobile.sendKeys("9845547471");
        
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("test@123");
        
        WebElement btn = driver.findElement(By.xpath("/html/body/div/form/input[5]"));
        btn.click();
        
        
        
        
       
        
	}

}
