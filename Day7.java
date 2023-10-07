package testng3;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day7 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
	}

	//use of assert equal and asser not equal
	
	@Test
	public void testCase1() {
		String expectedTitle = "WebDriverUniversity.com";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
		
		
		//removing target = 'blank' attribute so that contact us page will open in same tab
		WebElement contact = driver.findElement(By.id("contact-us"));
		JavascriptExecutor JsE = (JavascriptExecutor) driver;
		JsE.executeScript("arguments[0].removeAttribute('target')", contact);
		contact.click();
		String actualTitle2 = driver.getTitle();
		
		assertNotEquals(actualTitle2, expectedTitle);
		
		
	}
	
	//use of assert ture and assert false
	@Test
	public void testCase2() {
		String currentUrl = driver.getCurrentUrl();
		boolean B1 = currentUrl.contains("university");
		assertTrue(B1);
		
		//assert false
		//using google
		driver.get("https://www.google.com/");
		String googleUrl = driver.getCurrentUrl();
		boolean B2 = googleUrl.contains("university");
		assertFalse(B2);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
