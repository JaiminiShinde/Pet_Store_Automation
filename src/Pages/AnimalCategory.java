package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnimalCategory {
	public static void Animal_Category_Fish(WebDriver driver) throws InterruptedException {
		// FISH SELECTION
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'FI-FW-01')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'EST-4')]")).click();
		Thread.sleep(2000);
		
		//COMMON
		String Content = driver.findElement(By.id("Catalog")).getText();
		System.out.println("Fish Details\n" + Content);
		driver.findElement(By.className("Button")).click();
		Thread.sleep(2000);
		String CartContent = driver.findElement(By.id("Cart")).getText();
		System.out.println("Cart Content is:\n" + CartContent);
		System.out.println(".........................................................");
		driver.findElement(By.xpath("//a[contains(.,'Proceed to Checkout')]")).click();
		Thread.sleep(2000);
	}

	public static void Animal_Category_Dogs(WebDriver driver) throws InterruptedException {
		// DOGS SELECTION

		driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'K9-RT-01')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'EST-28')]")).click();
		Thread.sleep(2000);
		
		//COMMON
		String DogDetail = driver.findElement(By.xpath("//table//tbody")).getText();
		Thread.sleep(2000);
		System.out.println("Dog Details :\n"+DogDetail);
		System.out.println(".........................................................");
		driver.findElement(By.className("Button")).click();
		Thread.sleep(2000);
		String ShoppingCart = driver.findElement(By.xpath("//div//table//tbody")).getText();
		Thread.sleep(2000);
		System.out.println("Shopping Cart Details :\n"+ShoppingCart);
		System.out.println(".........................................................");
		driver.findElement(By.xpath("//a[contains(.,'Proceed to Checkout')]")).click();
		Thread.sleep(2000);
		
	}
	public static void Animal_Category_Birds(WebDriver driver) throws InterruptedException {
		//BIRDS SELECTION
		
		driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'AV-SB-02')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'EST-19')]")).click();
		
		//COMMON
		String BirdDetails = driver.findElement(By.xpath("//table//tbody")).getText();
		Thread.sleep(2000);
		System.out.println("Bird Details:\n"+BirdDetails);
		System.out.println(".........................................................");
		driver.findElement(By.className("Button")).click();
		Thread.sleep(2000);
		String ShoppingCartB = driver.findElement(By.xpath("//div//table//tbody")).getText();
		Thread.sleep(2000);
		System.out.println("Shopping Cart Details :\n"+ShoppingCartB);
		System.out.println(".........................................................");
		driver.findElement(By.xpath("//a[contains(.,'Proceed to Checkout')]")).click();
		Thread.sleep(2000);
		
		
		
	}

}
