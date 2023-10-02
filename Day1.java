package testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void test1() {
		System.out.println("Hello");
		// Selecting the element
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.cssSelector("#user-name"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement login = driver.findElement(By.cssSelector("#login-button"));

		// writting on it
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}

}
