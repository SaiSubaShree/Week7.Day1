package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DLead {
public ChromeDriver driver;

/* Feature: Login to Leaftap for Duplicate
Scenario Outline: Positive testing for duplicating the leaftap
Given Load the URL for Duplicating and maximize
When enter the username for Duplicating <username>
c
And click the login button for Duplicating
And Click on crmfsa link for Duplicating
And click on the Leads tab for Duplicating
And click on the FindLead tab for Duplicating
And click on phonenumber tab for Duplicating
And Enter the Phonenumber <phonenumber>
And click on the FindLeads for Duplicating
And click the first displayed value for Duplicating
And Click on the duplicate lead button
And clear the textbox and update the company name <compname>
And click on createLead button for Duplicating
*/
 
@Given ("Load the URL for Duplicating and maximize")
public void Dlaunch()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
}
@When ("enter the username for Duplicating {string}")
public void Dusername(String username)
{
	driver.findElement(By.id("username")).sendKeys(username);

}
@And ("enter the password for Duplicating {string}")
public void Dpassword(String password)
{
	driver.findElement(By.id("password")).sendKeys(password);
}
@And ("click the login button for Duplicating")
public void Dlogin()
{
	driver.findElement(By.className("decorativeSubmit")).click();
	
}
@And ("Click on crmfsa link for Duplicating")
public void DLink()
{
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
}

@And ("click on the Leads tab for Duplicating")
public void DLeadstab()
{
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
}
@And ("click on the FindLead tab for Duplicating")
public void Dfindlead() throws InterruptedException
{
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(2000);
}
@And ("click on phonenumber tab for Duplicating")
public void DPhonenum()
{
	 driver.findElement(By.xpath("//span[text()='Phone']")).click();
}
@And ("Enter the Phonenumber for Duplicating {string}")
public void Dphonenumber(String phonenumber)
{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
}
@And ("click on the FindLeads for Duplicating")
public void dFindlead() throws InterruptedException
{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 Thread.sleep(3000);
}
@And ("click the first displayed value for Duplicating")
public void FDupe() throws InterruptedException
{
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	 Thread.sleep(2000);
}

@And ("Click on the duplicate lead button")
public void DDuplicate()
{
	driver.findElement(By.linkText("Duplicate Lead")).click();
}
@And ("clear the textbox and update the company name {string}")
public void Dcompname(String compname)
{
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
}

@And ("click on createLead button for Duplicating")
public void DDupeLead()
{
	driver.findElement(By.className("smallSubmit")).click();

}















}
