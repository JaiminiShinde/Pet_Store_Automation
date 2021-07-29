package Pet_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetStore_RegisterForm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		Thread.sleep(3000);
		
		WebElement UserName = driver.findElement(By.name("username"));
		UserName.sendKeys("Lewis_Caroll");
		Thread.sleep(3000);
		
		WebElement NewPwd = driver.findElement(By.name("password"));
		NewPwd.sendKeys("xyza");
		Thread.sleep(3000);
		
		WebElement RepeatPwd = driver.findElement(By.name("repeatedPassword"));
		RepeatPwd.sendKeys("xyza");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.firstName")).sendKeys("Lewis");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.lastName")).sendKeys("Caroll");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.email")).sendKeys("lewiscaroll@xyz.com");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.phone")).sendKeys("23456790");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.address1")).sendKeys("9 street rose road");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.address2")).sendKeys("chapel street");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.city")).sendKeys("Boston");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.state")).sendKeys("BOS");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.zip")).sendKeys("23987");
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.country")).sendKeys("USA");
		Thread.sleep(3000);
		
		WebElement SelectLanguage = driver.findElement(By.name("account.languagePreference"));
		SelectLanguage.click();
		Thread.sleep(3000);
		SelectLanguage.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.favouriteCategoryId")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//table[3]//tr[2]//td[2]//select//option[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.listOption")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("account.bannerOption")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("newAccount")).click();
		Thread.sleep(3000);	 
		
		driver.quit();
		

	}

}
