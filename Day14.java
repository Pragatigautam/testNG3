package testng3;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14 {
WebDriver driver;
@Test
public void testCase1() {
	driver = new ChromeDriver();
	driver.get("http://www.webdriveruniversity.com/");
	driver.findElement(By.id("contact-us")).click();
	Set<String> handles = driver.getWindowHandles();
	boolean windowFound = false;
	for(String win:handles) {
		System.out.println(win);
		if(driver.getCurrentUrl().contains("Contact-Us")) {
			windowFound=true;
		}
	}
	Assert.assertTrue(windowFound);
	
	//for taking screenShots
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	File src = screenshot.getScreenshotAs(OutputType.FILE);
	 String path ="/Users/pragatigautam/eclipse-workspace/testng3";
	 File destination = new File(path);
	 
	  try {
		FileUtils.copyFile(src,destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}
}
