package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardAndOrderDetails 
{
	public static void Payment(WebDriver driver) throws InterruptedException 
	{
		//CARD PAYMENT & ORDER DETAILS
				driver.findElement(By.name("order.cardType")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//select//option[2]")).click();
				Thread.sleep(2000);
				WebElement CreditNumber = driver.findElement(By.name("order.creditCard"));
				CreditNumber.clear();
				CreditNumber.sendKeys("240993120791000");
				Thread.sleep(2000);
				WebElement ExpiryDate = driver.findElement(By.name("order.expiryDate"));
				ExpiryDate.clear();
				ExpiryDate.sendKeys("24/09");
				Thread.sleep(2000);
				driver.findElement(By.name("newOrder")).click();
				driver.findElement(By.className("Button")).click();
				String OrderDetails = driver.findElement(By.xpath("//div//table//tbody")).getText();
				System.out.println("Order Details is as follows:\n"+OrderDetails);
				System.out.println(".........................................................");
				String Message = driver.findElement(By.className("messages")).getText();
				System.out.println(""+Message);
	}
}
