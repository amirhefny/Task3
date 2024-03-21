package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.SendDocument.selectedDocument;

public class HomePage {
   WebDriver driver;
   public HomePage(WebDriver driver){
      this.driver =driver;
   }
   private String url ="https://www.levelset.com/?_ga=2.191670826.1606269330.1711051257-263696200.1711051257";
   private String getPaidbtn ="//a[@class=\"btn btn-info btn-outline mob-dropdown-btn\"]";
   public void goToWebsite(){
      driver.get(url);
   }
   public void clickGetPaidBtn(){
      WebElement getPaid = driver.findElement(By.xpath(getPaidbtn));
      getPaid.click();
      Assert.assertEquals(selectedDocument.isDisplayed(),true);
   }

}
