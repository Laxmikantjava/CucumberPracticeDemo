package seleniumGluCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class test {

	String currentProjectPath;
	public WebDriver driver;
	String Username = "mngr343475";
	String password = "jUquruq";

	@Given("^Login page is open$")
	public void login_page_is_open() throws Throwable {
		// currentProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\git\\CucumberPracticeDemo\\CucumberDemo\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		//throw new PendingException();
	}

	@When("^Enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		//throw new PendingException();
	}

	@When("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {

		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		//throw new PendingException();
	}

	@Then("^User should be in the login page$")
	public void user_should_be_in_the_login_page() throws Throwable {
		//Assert.assertEquals(message, expected, actual);
		System.out.println("i am on the login page");
		//throw new PendingException();
	}
}
