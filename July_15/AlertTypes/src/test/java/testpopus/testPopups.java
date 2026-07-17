package testpopus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Helper;

public class testPopups {
	
	@Test
    public void TestPopups() throws Exception {

        WebDriver driver = Helper.StartBrowser("Chrome");

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        String result = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result);
        Assert.assertEquals("You successfully clicked an alert", result);

        driver.findElement(By.xpath("///p[@id='result']")).click();

        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(8000);
        alert2.dismiss();

        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals("You clicked: Cancel", result2);

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(8000);
        alert3.accept();

        String result3 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result3);
        Assert.assertEquals("You clicked: Ok", result3);

        driver.findElement(By.xpath("//p[@id='result']")).click();

        driver.switchTo().alert().sendKeys("Hello Arunima how are you");
        Thread.sleep(8000);
        driver.switchTo().alert().accept();

        String result4 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result4);
        Assert.assertEquals("You entered: Hello Arunima how are you", result4);

        driver.get("//button[@onclick='jsPrompt()']");

        String result5 = driver
                .findElement(By.xpath("//p[@id='result']"))
                .getText();

        Thread.sleep(8000);
        System.out.println(result5);
        Assert.assertEquals("Congratulations! You must have the proper credentials.", result5);

        driver.quit();
    }
}
