package testng3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day10A {
	WebDriver driver;
	//taking parameters from Day10A.xml and including and excluding tests
	@Parameters({ "username", "password" })
	@Test
	public void testCase1(String un, String pw) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("login-button")).click();
		boolean B1 = driver.getCurrentUrl().contains("inventory");
		AssertJUnit.assertTrue(B1);
		driver.close();
	}

	@Parameters({ "username", "password" })
	@Test
	public void testCase2(String un, String pw) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("login-button")).click();
		boolean B1 = driver.getCurrentUrl().contains("inventory");
		AssertJUnit.assertTrue(B1);
		driver.close();
	}

	@Parameters({ "username", "password" })
	@Test
	public void testCase3(String un, String pw) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("login-button")).click();
		boolean B1 = driver.getCurrentUrl().contains("inventory");
		AssertJUnit.assertTrue(B1);
		driver.close();
	}

	@Parameters({ "username", "password" })
	@Test
	public void testCase4(String un, String pw) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("login-button")).click();
		boolean B1 = driver.getCurrentUrl().contains("inventory");
		AssertJUnit.assertTrue(B1);
		driver.close();
	}
}
