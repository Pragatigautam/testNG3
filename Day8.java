package testng3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day8 {
	// Hard assert
	// test 2 will fail which will result in not executing test 3
	// so to avoid that we use soft assert
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}

	@Test
	public void testCase1() {
		// test1
		String acutualTitle = driver.getTitle();
		assertEquals(acutualTitle, "WebDriverUniversity.com");

		// test2
		boolean B1 = driver.getCurrentUrl().contains("nonsense");
		assertEquals(true, B1);

		// test3
		driver.findElement(By.id("contact-us")).click();
		
	}

	@Test
	public void testCase2() {
		// creating soft assert class
		//now even though test 2 fails it will execute test 3
		SoftAssert Sa = new SoftAssert();

		// test1
		String acutualTitle = driver.getTitle();
		Sa.assertEquals(acutualTitle, "WebDriverUniversity.com");

		// test2
		boolean B1 = driver.getCurrentUrl().contains("nonsense");
		Sa.assertEquals(true, B1);

		// test3
		driver.findElement(By.id("contact-us")).click();
		
		
		Sa.assertAll();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

}
