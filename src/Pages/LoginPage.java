package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public static void Login(WebDriver driver) throws InterruptedException 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign In')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Lewis_Caroll");
		Thread.sleep(2000);
		
		WebElement EnterPwd = driver.findElement(By.name("password"));
		EnterPwd.clear();
		Thread.sleep(2000);
		EnterPwd.sendKeys("xyza");
		Thread.sleep(2000);
		
		driver.findElement(By.name("signon")).click();
		Thread.sleep(3000);
		
		String PageTitle = driver.getTitle();
		System.out.println("Title of the Page is : " +PageTitle);
		
		String WelcomeContent = driver.findElement(By.id("WelcomeContent")).getText();
		System.out.println(""+WelcomeContent);
		System.out.println("...........................................................");

	}

}
