package automation_code_WebTables_Mar_28th_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyDetermine {
	public static WebDriver driver;
	public static String companyName1 = "RRIL";
	public static String companyName2 = "Nirlon";

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		//to determine the element in 120th row 4th col
		
		String element = driver.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr[120]/td[4]")).getText();
		System.out.println("The name of the element is : " + element);
		
		//determine total companies
		List<WebElement> companies = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[1]"));
		System.out.println("The total number of companies are : " + companies.size());
		
		//determine total currentPrices
		
		List<WebElement> cPrices = driver.findElements(By.xpath("//table[@class = 'dataTable']/tbody/tr/td[4]"));
		System.out.println("The total current Prices are : " + cPrices.size());
		
		//print names of all the companies along with their cPrices ??
		
		/*
		 * for (int i=0 ; i<companies.size(); i++) {
		 * System.out.println(companies.get(i).getText() + " --------------------" +
		 * cPrices.get(i).getText()); }
		 */
		
		//give me the cPrice of RRIL ?
		
		for (int i=0 ; i<companies.size(); i++) {
			if(companyName1.equals(companies.get(i).getText()) && companyName2.equals(companies.get(i).getText())) {
			System.out.println(companies.get(i).getText() + " -------------------->" + cPrices.get(i).getText());
			break;
		}

	}

	}
}
