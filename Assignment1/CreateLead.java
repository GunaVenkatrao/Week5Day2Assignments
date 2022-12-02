package week5.day2Class;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import week5.day1class.ProjectSpecific;
public class CreateLead extends ProjectSpecific {
@Test(dataProvider = "createlead")
	public  void runCreateLead(String cname,String fname,String lname,String phone) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider(name="createlead")
public String[][] getData()
{//[row][column]
	String [][] data= new String[2][4];
	data[0][0]="Testleaf";
	data[0][1]="Guna";
	data[0][2]="B";
	data[0][3]="398473";
	data[1][0]="Company";
	data[1][1]="Bharath";
	data[1][2]="R";
	data[1][3]="39843";
	return data;
}
}






