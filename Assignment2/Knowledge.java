package week5.day2Assignments;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Knowledge extends ProjectSpecificServiceNow {
@Test
	public void runKnowledge() throws InterruptedException {
		
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("knowledge");
		shadow.findElementByXPath("//span[text()='Knowledge']").click();
		WebElement frele = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frele);
		driver.findElement(By.xpath("//span[@class='btn-text']//parent::button")).click();
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
		Set<String> st = driver.getWindowHandles();
		List<String> lst=new ArrayList<String>(st);
		driver.switchTo().window(lst.get(1));
		//System.out.println(lst);
		driver.findElement(By.xpath("//a[text()='IT']")).click();
		//driver.switchTo().defaultContent();
		driver.switchTo().window(lst.get(0));
		WebElement elem1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elem1);
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']")).click();
		//WebElement category = driver.findElement(By.xpath("//iframe[@id='AC.kb_knowledge.kb_knowledge_base_shim']"));
		//driver.switchTo().frame(category);
		driver.findElement(By.xpath("(//div[@class='list-item arrow']/following-sibling::div)[3]")).click();
		driver.findElement(By.xpath("//span[text()='Java']//parent::div")).click();
		//WebElement category = driver.findElement(By.xpath("//iframe[@id='AC.kb_knowledge.kb_knowledge_base_shim']"));
		//driver.switchTo().frame(category);
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();;
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("test knowledgecase");
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		
		
		

	}

}
