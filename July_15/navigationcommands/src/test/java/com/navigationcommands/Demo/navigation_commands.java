package com.navigationcommands.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigation_commands {

    

    @Test
    public void NavigateDemo() {

        driver = new ChromeDriver();

        driver.navigate().to("https://www.google.co.in");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();
    }

    @Test
    public void NavigateBackDemo() {

        driver = new ChromeDriver();

        driver.get("https://www.google.co.in");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String Title = driver.getTitle();
        System.out.println(Title);

        driver.navigate().to("https://www.yahoo.co.in");

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().back();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();
    }

    @Test
    public void NavigateForward() {

        driver = new ChromeDriver();

        driver.get("https://www.google.co.in");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        String Title = driver.getTitle();
        System.out.println(Title);

        driver.navigate().to("https://www.yahoo.co.in");

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().back();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().forward();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();
    }

    @Test
    public void RefreshMethod() {

        driver = new ChromeDriver();

        driver.get("https://www.google.co.in");

        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.navigate().refresh();

        String Title = driver.getTitle();
        System.out.println(Title);

        driver.navigate().refresh();

        URL = driver.getCurrentUrl();
        System.out.println(URL);

        driver.quit();
    }
}