package testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

}
