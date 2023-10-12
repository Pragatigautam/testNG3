package testng3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day16 {
	WebDriver driver;
	String year = "2024";
	String month = "January";
	String day = "22";
	@Test
public void calenderTest() {
	driver = new ChromeDriver();
	driver.get("https://www.webdriveruniversity.com/Datepicker/index.html");
	driver.findElement(By.id("datepicker")).click();
	selectDate(driver,day,month,year);
	

	
}
	private void selectDate(WebDriver driver, String day, String month, String year) {
		String text = driver.findElement(By.className("datepicker-switch")).getText();
		System.out.println(text);
		//in text we will get "October 2023" which we are splitting using split method of string.
		String actualMonth = text.split(" ")[0];
		String actualYear = text.split(" ")[1];
		System.out.println(actualMonth);
		System.out.println(actualYear);
		System.out.println(actualMonth.equals(month)&&actualYear.equals(year));
		
		while(!(actualMonth.equals(month)&&actualYear.equals(year))){
			driver.findElement(By.className("next")).click();
			text = driver.findElement(By.className("datepicker-switch")).getText();
			actualMonth = text.split(" ")[0];
			actualYear = text.split(" ")[1];
			System.out.println(actualMonth);
			System.out.println(actualYear);
		}
		List<WebElement> days = driver.findElements(By.className("day"));
		for(int i = 0; i<days.size();i++) {
			if(days.get(i).getText().equals(day)){
				days.get(i).click();
				break;
			}
		}
		
		
	}
}
