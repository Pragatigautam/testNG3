package testng3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssignmentLinks {
    WebDriver driver;

    @Test
    public void totalLinks() {
        driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + links.size());

        List<String> urlList = new ArrayList<String>();
        for (WebElement e : links) {
            String url = e.getAttribute("href");  
            urlList.add(url);
            
            // Check for broken links
            checkForBrokenLinks(url);
        }
    }

    // broken Link
    public static void checkForBrokenLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
            httpUrlConnection.setConnectTimeout(5000);
            httpUrlConnection.connect();

            if (httpUrlConnection.getResponseCode() >= 400) {
                System.out.println(linkUrl + "--->" + httpUrlConnection.getResponseMessage() + " is a broken link.");
            } else {
                System.out.println(linkUrl + " is a valid link.");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
