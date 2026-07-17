package com.delenuimwebdriver.firefoxtest;

public class firefixTest {

	public static void main(String[] args) {
		FireforDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();

	}

}
