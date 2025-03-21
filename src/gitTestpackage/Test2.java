package gitTestpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Test2 {

	public static void main(String... args) {
	
	
	WebDriver driver =new ChromeDriver();
	    	SoftAssert softAssert=new SoftAssert();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	        driver.get("https://deployqa.deepfreeze.com/");
	        String email = "vikashd@alohatechnologydev.com";
	        String password = "Aloha@123";
	        driver.findElement(By.name("EmailAddress")).sendKeys(email);
	        driver.findElement(By.name("Password")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
}
}
