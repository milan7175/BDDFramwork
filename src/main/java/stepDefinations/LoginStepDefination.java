package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	
	
WebDriver driver;

	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {	   

		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
	    	   
	}
	
	
	@When("^title of Login Page is Amazon\\.ca: Low Prices – Fast Shipping – Millions of Items$")
	public void title_of_Login_Page_is_Amazon_ca_Low_Prices_Fast_Shipping_Millions_of_Items() throws Throwable {
	    String title = driver.getTitle();
	    Assert.assertEquals(title, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	
	@Then("^User hovers to Login element and click on SignIn$")
	public void user_hovers_to_Login_element_and_click_on_SignIn() throws Throwable {

		WebElement signIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signIn).build().perform();
		
		Thread.sleep(2000);
		WebElement signInButton = driver.findElement(By.className("nav-action-inner"));
		signInButton.click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon Sign In");
	}
	
	@Then("^User enter EmailId and click on continue$")
	public void user_enter_EmailId_and_click_on_continue() throws Throwable {
	driver.findElement(By.id("ap_email")).sendKeys("milanthakkar09@gmail.com");
	driver.findElement(By.id("continue")).click();
	}
	
	@Then("^User enter password and click on continue$")
	public void user_enter_password_and_click_on_continue() throws Throwable {
	    driver.findElement(By.id("ap_password")).sendKeys("Milan@1234");
	    driver.findElement(By.id("signInSubmit")).click();
	}
	
	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

		String title =  driver.getTitle();
		Assert.assertEquals(title, "Amazon.ca: Low Prices – Fast Shipping – Million of Items");
		
		
	}

	
	

	

}
