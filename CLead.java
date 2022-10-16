package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CLead {
public ChromeDriver driver;
	@Given ("Load the Url and maximise the window")
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
	
	@When ("the Provided username {string}")
	public void username(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And ("the Provided password {string}")
	public void password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And ("click the Login button")
	public void login() throws InterruptedException
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
	}
	@Then ("Login page is loaded")
	public void validate() throws InterruptedException
	{
		System.out.println("The page is loaded");
		Thread.sleep(3000);
	}
	@And ("Click the CRMFSA Link")
	public void crmfsa()
	{
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	
	@And ("Click on Leads tab")
	public void leadtab()
	{
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	
	@And ("click on Create Lead")
	public void createlead() throws InterruptedException
	{
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
	}
	
	@And ("Enter the Companyname {string}")
	public void companyname(String companyname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@And ("Enter the Firstname {string}")
	public void firstname(String firstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	@And ("Enter the Lastname {string}")
	public void lastname(String lastname) throws InterruptedException
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		Thread.sleep(3000);
	}
	@And ("Click on Create Lead button")
	public void submit()
	{
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then ("Verify CreateLead")
	public void verify()
	{
		System.out.println("lead is created");
	}
	
	
}
