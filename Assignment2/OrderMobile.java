package week5.day2Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class OrderMobile extends ProjectSpecificServiceNow {
@Test
	
	public void runOrderMobile() throws InterruptedException {
	
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service Catalog");
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frele = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frele);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		//WebElement elem1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		//driver.switchTo().frame(elem1);
		shadow.findElementByXPath("//h2[text()='Apple iPhone 13 pro']").click();
		driver.findElement(By.xpath("//input[@value='no']//parent::span")).click();
		driver.findElement(By.xpath("//input[@value='gold']//parent::span")).click();
		driver.findElement(By.xpath("//input[@value='128']//parent::span")).click();
		WebElement drop1 = driver.findElement(By.xpath("//select[contains(@class,'cat_item_option')]"));
		Select d1=new Select(drop1);
		d1.selectByIndex(1);
		
		driver.findElement(By.id("oi_order_now_button")).click();
		String msg = driver.findElement(By.xpath("//div[contains(@class,'notification-success')]//span")).getText();
		System.out.println(msg);
		if(msg.contains("submitted"))
		{
			System.out.println("Order placed successfully.");
		}
		else
		{
			System.out.println("order is not placed.");
		}
		String reqno = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("The Request number is "+reqno);
		
		
		
		
	}

}
