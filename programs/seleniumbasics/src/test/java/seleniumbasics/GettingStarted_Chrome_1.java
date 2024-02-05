package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingStarted_Chrome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\kaushalya\\consultancy\\kristu\\jan2024\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "http://www.kaushalya.tech/";					
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("title is "+title);

	}

}
