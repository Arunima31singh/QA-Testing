package com.NavigationMethods.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sleleniumlocator {

    int total = 0;

    WebDriver driver;

    @BeforeTest
    public void setup() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.hollandandbarrett.com/");
        Thread.sleep(2000);

        try {
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        } catch (Exception e) {
            System.out.println("Cookie popup not displayed.");
        }
    }

    @Test
    public void findElementById() throws Exception {

        driver.findElement(By.xpath("//a[contains(text(),'Vitamins & Supplements')]")).click();
        driver.findElement(By.linkText("Vitamins & Supplements")).click();

        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int linkCount = links.size();

        total = total + linkCount;

        System.out.println("Number of links: " + linkCount);

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }
    }

}