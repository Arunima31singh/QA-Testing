package com.webdrivercommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browsertitlecheck {
	
	@Test
	
	public void verifyBrowserTitle() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        // Actual Title
        String actualTitle = driver.getTitle();

        // Expected Title
        String expectedTitle = "Selenium";

        // Print both values
        System.out.println("Expected Title : " + expectedTitle);
        System.out.println("Actual Title   : " + actualTitle);

        // Verify the title
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Case Passed");
        } else {
            System.out.println("Test Case Failed");
        }
	}
}
