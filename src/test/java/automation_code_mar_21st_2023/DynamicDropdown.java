package automation_code_mar_21st_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {
	
	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy = 'roundTrip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(), 'New York, United States')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("toCity")).click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'To']")));
		
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Boston");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'Boston, United States')]")));
	    driver.findElement(By.xpath("//p[contains(text(), 'Boston, United States')]")).click();
	}

}
