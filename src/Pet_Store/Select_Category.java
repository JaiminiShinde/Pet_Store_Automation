package Pet_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AnimalCategory;
import Pages.CardAndOrderDetails;
import Pages.LoginPage;

public class Select_Category {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		LoginPage.Login(driver);

		// SWITCH CASE
		
		String AnimalSelection = "Dogs";
		switch (AnimalSelection) {
		case "Birds":
			System.out.println("Animal Cateogory Birds executed successfully");
			AnimalCategory.Animal_Category_Birds(driver);
			CardAndOrderDetails.Payment(driver);

			break;
		case "Dogs":
			System.out.println("Animal Category Dogs executed successfully");
			AnimalCategory.Animal_Category_Dogs(driver);
			CardAndOrderDetails.Payment(driver);

			break;
		case "Fish":
			System.out.println("Animal Category Fish executed successfully");
			AnimalCategory.Animal_Category_Fish(driver);
			CardAndOrderDetails.Payment(driver);

			break;
			
        default:
			System.out.println("You Selected Invalid Option");

		}

		driver.quit();

	}

}