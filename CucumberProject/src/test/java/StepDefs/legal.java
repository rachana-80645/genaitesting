package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class legal {
	WebDriver driver;
	private Actions action;
	public legal() {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\2000080645\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	 EdgeOptions options = new EdgeOptions();
         options.addArguments("--inprivate");
         driver = new EdgeDriver(options);
         driver.manage().window().maximize();
    }
	@Given("open Url and click SSO button")
	public void url() throws InterruptedException {
		driver.get("https://legalbot-demo.tensai.run/");
		Thread.sleep(3000);
		WebElement ssobutton = driver.findElement(By.xpath("//button[@type='button']"));
		ssobutton.click();
		Thread.sleep(3000);
      
	}
	
	@When("log in with username and password sign in to the application")
	public void login() throws InterruptedException {
		WebElement username = driver.findElement(By.id("i0116"));
		username.sendKeys("RachanaN2@hexaware.com");
		Thread.sleep(3000);
		WebElement next = driver.findElement(By.xpath("//*[@id='idSIButton9']"));
		next.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("i0118"));
		password.sendKeys("Sowmya@9844#");	
		Thread.sleep(3000);
	}
	@And("sign in to the application")
	public void signin() throws InterruptedException {
		WebElement signin = driver.findElement(By.xpath("//*[@id='idSIButton9']"));
		signin.click();
		Thread.sleep(3000);
	}
	
	@And("confirm the Stay signed in")
	public void confirm() throws InterruptedException {
		WebElement confirm = driver.findElement(By.xpath("//*[@id='idBtn_Back']"));
		confirm.click();
		Thread.sleep(3000);
	}
	
	@Then("click on the Automate Contract Review button upload the file and wait for the contract review process to complete")
	public void Acr() throws InterruptedException {
		//String file1 = System.getProperty("user.dir") + "/src/test/resources/testdatafiles/EU_NDA_2024_82_DR_original.pdf";
		String file2 = System.getProperty("user.dir") + "/src/test/resources/testdatafiles/USA_NDA_2023_572_DR_customer version 3.docx";
		WebElement Acr = driver.findElement(By.xpath("//button[@type='button']"));
		Acr.click();
		Thread.sleep(3000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display = 'block';", fileInput);
        fileInput.sendKeys(file2);
        Thread.sleep(3000);
        WebElement Automate = driver.findElement(By.xpath("//*[text()='Automate Contract Review']"));
        Automate.click();
        Thread.sleep(3*60*1000);

	}
	@Then("download the Red-lined Document")
	public void Download() throws InterruptedException {
        driver.findElement(By.xpath("//tbody//child::tr[1]//child::td[4]")).click();
        Thread.sleep(2000);
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(By.xpath("//*[text() = 'Download Red-lined Document']")).click();
        Thread.sleep(10000);
	}
	
	  @Then("click on the Try Another button") public void Tryanother() throws
	  InterruptedException {
	  driver.findElement(By.xpath("//*[text()='Try Another']")).click();
	  Thread.sleep(2000); }
	
	
	 @Then("logout of Legal copilot") 
	 public void logout() throws InterruptedException {
		 WebElement profile = driver.findElement(By.xpath("//span[@class = 'ant-avatar-string']"));
		 profile.click();
		 Thread.sleep(3000);
		 WebElement logout  = driver.findElement(By.xpath("//span[text()='logout']")); 
		 logout.click(); 
		 driver.quit(); }
}
