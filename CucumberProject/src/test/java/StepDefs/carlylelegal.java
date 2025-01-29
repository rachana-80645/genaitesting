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

public class carlylelegal {
	WebDriver driver;
	private Actions action;
	public carlylelegal() {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\2000080645\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	 EdgeOptions options = new EdgeOptions();
         options.addArguments("--inprivate");
         driver = new EdgeDriver(options);
         driver.manage().window().maximize();
	}
}
