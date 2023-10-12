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

        // Get the handles of all open windows
        Set<String> handles = driver.getWindowHandles();
        boolean windowFound = false;

        // Iterate through each window
        for (String win : handles) {
            // Switch to the window
            driver.switchTo().window(win);

            // Check if the current URL contains "Contact-Us"
            if (driver.getCurrentUrl().contains("Contact-Us")) {
                windowFound = true;
                break; // Break out of the loop if the window is found
            }
        }

        // Assert that the window with the expected URL is found
        Assert.assertTrue(windowFound);

        // Take a screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        String path = "/Users/pragatigautam/eclipse-workspace/testng3/img.png";
        File destination = new File(path);

        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
