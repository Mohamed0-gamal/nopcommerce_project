package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class TC03_currenciesStepDef {
    P03_homePage currency =new P03_homePage();

    @Given("Select Euro currency from the dropdown list on the top left of home page")
    public void  static_dropDownList ()
    {
       WebElement LIST = Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        Select DropDown = new Select(LIST);
        DropDown.selectByIndex(1);
    }
   @Then("Verify that the currency has been successfully changed")
    public void successful_change()
   {
      String Euro = Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]")).getText();
       Assert.assertTrue(Euro.contains("€"));

   }
}
