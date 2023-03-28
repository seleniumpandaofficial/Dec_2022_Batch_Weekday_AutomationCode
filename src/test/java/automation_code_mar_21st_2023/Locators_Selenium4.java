package automation_code_mar_21st_2023;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Selenium4 {
	
	//public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {
	//	options = new ChromeOptions();
	//	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	//	options.addArguments("--start-maximized");
	//	options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Step 1 -  you have to identify a reference WebElement
		WebElement referencePoint = driver.findElement(By.xpath("//p[contains(text(), 'Password')]"));
		
		//above
		String aboveElement = driver.findElement(with(By.tagName("p")).above(referencePoint)).getText();
		System.out.println("the element above the reference element is : " + aboveElement);
	
		
		//below
		
		
		//near
		
	
		//torightOf
		
		
		//toLeftOf
		

	}

}
