package WebDriver_DropDownBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownBox {
	
	WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");   // Change to your dropdown page
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
	
	
	
    @Test
    public void DropDownList() throws Exception {

        WebElement Country_Dropdown = driver.findElement(By.id("country"));
        Select country_list = new Select(Country_Dropdown);

        country_list.selectByIndex(3);
        Thread.sleep(10000);

        country_list.selectByVisibleText("India");
        Thread.sleep(10000);

        WebElement option = country_list.getFirstSelectedOption();
        String countryindex = option.getText();
        System.out.println(countryindex);

        List<WebElement> c_list = country_list.getOptions();
        int total_month = c_list.size();
        System.out.println("Total months count in List : " + total_month);

        for (WebElement ele : c_list) {
            String cou_name = ele.getText();
            System.out.println("Country Names in list: " + cou_name);
        }
    }
    
}
