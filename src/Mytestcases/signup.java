package Mytestcases;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signup extends parmetars {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test
	public void signUp() {
		WebElement createAccount = driver
				.findElement(By.cssSelector("header[class='page-header'] li:nth-child(3) a:nth-child(1)"));
		createAccount.click();
		WebElement firstName = driver.findElement(By.id("firstname"));
		WebElement secandnA = driver.findElement(By.id("lastname"));
		WebElement email = driver.findElement(By.id("email_address"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement confepassword = driver.findElement(By.id("password-confirmation"));
		WebElement createAccount2 = driver.findElement(By.cssSelector("button[title='Create an Account'] span"));
		firstName.sendKeys(firstNames[randomindx]);
		secandnA.sendKeys(secandnAs[randomindx]);
		email.sendKeys(emailID);
		password.sendKeys(passwords1);
		confepassword.sendKeys(passwords1);
		createAccount2.click();
		String expected = "Thank you for registering with Main Website Store.";
		String acutal1 = driver.findElement(By.className("message-success")).getText();
		assertEquals(acutal1, expected);

	}

	@AfterTest()
	public void afterTest() {
	}

}
