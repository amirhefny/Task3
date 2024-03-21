package test;

import org.example.HomePage;
import org.example.SendDocument;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Review_One {
    WebDriver driver = new ChromeDriver();
    @Test
    public void test_Window(){
        driver.manage().window().maximize();
        HomePage home = new HomePage(driver);
        home.goToWebsite();
        home.clickGetPaidBtn();
        SendDocument senddocument = new SendDocument(driver);
        senddocument.clickOnDocument();
        Assert.assertEquals(senddocument.getText(),"$449");
    }
    @AfterTest
    public void teardown(){
       // driver.quit();
    }
}
