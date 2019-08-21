package mystepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class testme_report {
	WebDriver driver;
	@Given("TestMe is up and running")
	public void testme_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\TESTING\\selenium\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
	}

	@Then("user enter valid credentials")
	public void user_enter_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
		driver.findElement(By .name("password")).sendKeys("password123");
		driver.findElement(By .name("Login")).click();
		
	}

	@Then("verify for login status")
	public void verify_for_login_status() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		String b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
		Assert.assertEquals("SignOut",b);
	}

}
