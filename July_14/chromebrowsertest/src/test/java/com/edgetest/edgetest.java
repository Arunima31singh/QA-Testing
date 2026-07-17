package com.edgetest;

import org.openqa.selenium.edge.EdgeDriver;

public class edgetest {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}

}
