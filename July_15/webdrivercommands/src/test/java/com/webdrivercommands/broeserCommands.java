package com.webdrivercommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class broeserCommands {
	@Test(priority=0)
	public void chromebrowsertest() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		String CURL = driver.getCurrentUrl();
		System.out.println(CURL);
		
		String PG = driver.getPageSource();
		System.out.println(PG);
		
	}
	
	@Test(priority=2)
	public void Firefoxbrowser() {
		FirefoxDriver dv = new FirefoxDriver();
		dv.get("https://www.selenium.dev/");
		
        dv.manage().window().maximize();
		
		String BrowserTitle = dv.getTitle();
		System.out.println(BrowserTitle);
		
		String CURL = dv.getCurrentUrl();
		System.out.println(CURL);
		
		String PG = dv.getPageSource();
		System.out.println(PG);
		
		
	}
	
	@Test(priority=1)
	public void Edgedrivertest() {
		
		EdgeDriver dvr = new EdgeDriver();
		dvr.get("https://www.selenium.dev/");
		
        dvr.manage().window().maximize();
		
		String BrowserTitle = dvr.getTitle();
		System.out.println(BrowserTitle);
		
		String CURL = dvr.getCurrentUrl();
		System.out.println(CURL);
		
		String PG = dvr.getPageSource();
		System.out.println(PG);
		
	}
	

}
