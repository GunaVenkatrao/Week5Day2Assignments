package week5.day2Assignments;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewProposal extends ProjectSpecificServiceNow {
@Test
	public  void runNewProposal() {
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Proposal",Keys.ENTER);
		
		shadow.findElementByXPath("//span[text()='My Proposals']").click();
		WebElement frele = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frele);
		 List<WebElement> befrow = driver.findElements(By.xpath("//tbody[@class='list2_body']//tr"));
			System.out.println("Total number of rows are "+befrow.size());
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Proposal test12334");
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
	
		 List<WebElement> afrow = driver.findElements(By.xpath("//tbody[@class='list2_body']//tr"));
			System.out.println("Total number of rows are "+afrow.size());
			
			
			if((befrow.size()+1)==afrow.size())
			{
				System.out.println("New proposal added successfuly");
			}
			else
			{
				System.out.println("New proposal is not added");
			}
			

	}

}
