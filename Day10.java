package testng3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day10 {
	WebDriver driver;

	@Test
	public void AutosuggestDropdown() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("p");
		
		//in below like we have done "> div" that is because this is a list of WebElements and div represents all the elements it has on the list
		//we can see it by inspect
		List<WebElement> listA = driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		for(int i=0; i<listA.size(); i++) {
		System.out.println(i);
		if(listA.get(i).getText().contains("Pancakes")) {
			listA.get(i).click();
			break;
		}
		}
		
		driver.findElement(By.cssSelector("#submit-button")).click();
		String U = driver.getCurrentUrl();
		boolean B1 = U.contains("Pancakes");
		AssertJUnit.assertTrue(B1);
		driver.close();
	}
}
