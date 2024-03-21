package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendDocument {
        WebDriver driver ;
        public SendDocument(WebDriver driver){
            this.driver =driver;
        }
        public static WebElement selectedDocument ;
        private String price ="//div[@class=\"panel-heading left-right-pair\"]//span[contains(text(),'449')]";
       private String selectedDocumentt ="//div[@class=\"panel-heading left-right-pair\"]//div[contains(text(),'File a Lien')]";
        public void clickOnDocument(){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
             selectedDocument = driver.findElement(By.xpath(selectedDocumentt));
            //wait.until(d -> selectedDocument.isDisplayed());
            wait.until(ExpectedConditions.visibilityOf(selectedDocument));
            selectedDocument.click();
        }

        public String getText(){
            WebElement getPrice= driver.findElement(By.xpath(price));
            System.out.println(getPrice.getText());
            return getPrice.getText();
        }
}
