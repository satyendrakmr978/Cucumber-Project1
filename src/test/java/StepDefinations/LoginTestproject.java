package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginTestproject {
	
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		
		 driver = new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver","E:\\Chromedriver\\Chromedriver.exe");
		 
		
		   driver.manage().window().maximize();
	  
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(5000);
	}

	@When("^user enters(.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
	    driver.findElement(By.id("name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password); 
	    Thread.sleep(5000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	   
	}

	@Then("user should be navigated to search result page")
	public void user_should_be_navigated_to_search_result_page() {
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	   
	}


}
