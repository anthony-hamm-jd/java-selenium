package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class locator1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Running tests with FireFox
		System.setProperty("webdriver.gecko.driver", "C:/Users/JaneiroDigital02/Documents/Janeiro Digital/Automation/Java--Selenium/GeckoDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
//		Finding elements by xpath
//		driver.get("http://qaclickacademy.com");
//		driver.findElement(By.xpath(".//*[@id='newsletter']/div[2]/div[3]/a")).click();
		
//		Finding elements by ID
//		driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("anthonyhamm31@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Password1.");
//		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
		
//		Finding elements by ClassName
		driver.get("http://facebook.com");
		driver.findElement(By.className("inputtext")).sendKeys("anthonyhamm31@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Password1.");
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		

		
	}

}
