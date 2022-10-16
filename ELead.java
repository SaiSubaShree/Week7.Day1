package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ELead {
public ChromeDriver driver;
@Given ("Load the URL for Editing and maximize")
public void ELaunch()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
}

@When ("enter the username for editing {string}")
public void Eusername(String username) throws InterruptedException
{
	driver.findElement(By.id("username")).sendKeys(username);
	Thread.sleep(2000);
}

@And ("enter the password for editing {string}")
public void Epassword(String Epassword)
{
	driver.findElement(By.id("password")).sendKeys(Epassword);
}

@And ("click the login button for editing")
public void ELogin() throws InterruptedException
{
	driver.findElement(By.className("decorativeSubmit")).click();
	Thread.sleep(3000);
}

@And ("Click on crmfsa link for editing")
public void ELink()
{
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
}
@And ("click on the Leads tab for editing")
public void ELeadstab()
{
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
}
@And ("click on the FindLead tab")
public void EFindLead() throws InterruptedException
{
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(2000);
}
 @And ("click on phonenumber tab")
 public void phonenumbertab()
 {
	 driver.findElement(By.xpath("//span[text()='Phone']")).click();
 }
 @And ("Enter the Phonenumber {string}")
 public void phonenumber(String phonenumber)
 {
	 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
 }
 
 @And ("click on the FindLeads")
 public void EFindleads() throws InterruptedException
 {
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 Thread.sleep(3000);
 }
 
 @And ("click the first displayed value")
 public void display() throws InterruptedException
 {
	 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
 Thread.sleep(2000);
 }
 @And ("Click on the Edit button")
 public void EEdit()
 {
	 driver.findElement(By.linkText("Edit")).click();
 }
 
 @And ("update the company name {string}")
 public void Ecompname(String compname)
 {
 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compname);
 }
 
 @And ("click on update button")
 public void Updatebutton()
 {
	 driver.findElement(By.name("submitButton")).click();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 











}