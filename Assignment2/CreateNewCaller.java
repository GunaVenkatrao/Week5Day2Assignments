package week5.day2Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewCaller extends ProjectSpecificServiceNow {
@Test
	public void runNewCaller() throws InterruptedException {
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Caller");
		shadow.findElementByXPath("//span[text()='Callers']").click();
		WebElement frele = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frele);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("GunaBharath");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Mrs");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("gunavenkat@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("4583746923");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9788193401");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[1]")).sendKeys("test",Keys.ENTER);
		Thread.sleep(100);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[3]")).sendKeys("test",Keys.ENTER);
		String returnfrstname = driver.findElement(By.xpath("(//td[@class='vt'])[2]")).getText();
		System.out.println(returnfrstname);
		if(returnfrstname.equals("test"))
		{
			System.out.println("New caller added correctly");
		}
		else
		{
			System.out.println("New caller is not added.");
		}

	}

}
