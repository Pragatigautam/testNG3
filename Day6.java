package testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day6 {
	// javascript executor to click on element
	ChromeDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/index.html");
	}

	@Test
	public void test1() {
		driver.get("http://www.webdriveruniversity.com/");
		WebElement contactUsLink = driver.findElement(By.id("contact-us"));
		JavascriptExecutor jsE = (JavascriptExecutor) driver;
		jsE.executeScript("arguments[0].click()", contactUsLink);
		driver.close();

	}

	@Test()
	public void TestCase2() throws InterruptedException {
		// javascript executor to click on element
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		// driver.findElement(By.id("contact-us")).click();
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)", scrollElement);
		Thread.sleep(5000);
		driver.close();
	}

	// set up new attribute for element
	// <h1 id = "hello">Hello</h1>

	@Test()
	public void TestCase3() throws InterruptedException {
		// javascript executor to click on element
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		// driver.findElement(By.id("contact-us")).click();
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].setAttribute('data-cy','two')", scrollElement);
		// je.executeScript("arguments[0].removeAttribute('data-cy')", scrollElement);
		String attributeValue = scrollElement.getAttribute("data-cy");// two
		System.out.println(attributeValue);
		// driver.close();
	}

	@Test
	public void TestCase4() throws InterruptedException {
		// javascript executor to click on element
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		// driver.findElement(By.id("contact-us")).click();
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		String title = (String) je.executeScript("return document.title;");
		// First parameter of JavascriptExecutor is script
		Assert.assertEquals(title, "WebDriverUniversity.com");
		driver.close();
	}

	@Test
	public void TestCase5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions ac = new Actions(driver);
		WebElement e = driver.findElement(By.id("double-click"));
		ac.doubleClick(e).build().perform();
		String className = e.getAttribute("class");
		Assert.assertEquals(className, "div-double-click double");
		driver.close();
	}
	
	
	  
	//last test case

}
