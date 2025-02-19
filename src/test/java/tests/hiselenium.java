package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumTest {
    private static final Logger logger = LoggerFactory.getLogger(SeleniumTest.class);

    public static void main(String[] args) {
        // No need to set ChromeDriver path in Selenium 4 / Appium 4
        WebDriver driver = new ChromeDriver();

        try {
            // Open a website
            driver.get("https://www.google.com");

            // Find the search box element
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type a search query
            searchBox.sendKeys("Selenium WebDriver Java");

            // Submit the search form
            searchBox.submit();

            // Wait for results and print the title
            Thread.sleep(2000);
            System.out.println("Page Title: " + driver.getTitle());
        } catch (Exception e) {
            logger.error("An error occurred: ", e); // Proper logging instead of printStackTrace
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
