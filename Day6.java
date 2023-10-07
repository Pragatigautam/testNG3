package testng3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day6 {
	WebDriver driver;

//clicking on element using javascript executor
	@Test
	public void testCase1() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement contactUsLink = driver.findElement(By.id("contact-us"));
		JavascriptExecutor JsE = (JavascriptExecutor) driver;
		JsE.executeScript("arguments[0].click()", contactUsLink);
		driver.close();
	}

	// scrolling till it finds the element scroll
	@Test
	public void testCase2() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scrollElement = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor JsE = (JavascriptExecutor) driver;
		JsE.executeScript("arguments[0].scrollIntoView(true)", scrollElement);
		driver.close();
	}

	// adding new attribute using javascript executor

	@Test
	public void testCase3() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scroll = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor JsE = (JavascriptExecutor) driver;
		JsE.executeScript("arguments[0].setAttribute('Atrbt', 'vl1')", scroll);
	}

	// getting title using javascript executor
	@Test
	public void testCase4() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement scroll = driver.findElement(By.id("scrolling-around"));
		JavascriptExecutor JsE = (JavascriptExecutor) driver;
		String title = (String)JsE.executeScript("return document.title");
		Assert.assertEquals(title, "WebDriverUniversity.com");
		driver.close();
	}
	//double clicking and validating from attribute and value
	@Test
	public void testCase5() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		//creating instance of Action class with driver as a parameter
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.id("double-click"));
		a.doubleClick(ele).build().perform();
		//after clicking the value if class attribute will change that is what we are validating
		String Attr = ele.getAttribute("class");
		Assert.assertEquals(Attr, "div-double-click double");
		driver.close();
	}
	//dragging and dropping
	@Test
	public void testCase6() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions a = new Actions(driver);
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Drag, drop).build().perform();
		Assert.assertEquals(drop.getText(), "Dropped!");
		driver.close();
	}
	//click and hold
	@Test
	public void testcase7() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions a = new Actions(driver);
		WebElement hold = driver.findElement(By.id("click-box"));
		a.clickAndHold(hold).build().perform();
		Assert.assertEquals(hold.getText(), "Well done! keep holding that click now.....");
		driver.close();
	}
	//double clicking 
	@Test
	public void testCase8() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions a = new Actions(driver);
		WebElement DoubleClick = driver.findElement(By.id("double-click"));
		a.doubleClick(DoubleClick).build().perform();
		
		//using sleep wait and surrounding by try catch
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

	//hover and validate the new element displayed after hover
	@Test
	public void testCase9() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		Actions a = new Actions(driver);
		WebElement hover = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		a.moveToElement(hover).build().perform();
		WebElement link = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a"));
		
		Assert.assertEquals(true, link.isDisplayed());
	}
	
	

}
