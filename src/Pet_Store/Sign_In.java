package Pet_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class Sign_In {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(2000);
		
		LoginPage.Login(driver);
				
		driver.quit();

	}
	
}
