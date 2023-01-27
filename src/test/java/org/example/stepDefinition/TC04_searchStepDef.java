package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TC04_searchStepDef {
    P03_homePage search = new P03_homePage();
    @Given("Write the word book inside the search place")
    public void book_search ()
    {
       search.BOOK_WORD().sendKeys("BOOK");
       search.search_clicl().click();
    }
    @Then("Make sure that  pressure on the search button appears for the search URL")
    public void verify_search_URL ()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=BOOK");
        soft.assertAll();
    }
    @Then("Count number of search results")
    public void count ()
    {
        search.BOOK_WORD().sendKeys("BOOK");
        List<WebElement> Count_list = Hooks.driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"]"));
        Count_list.size();
    }
    @Given("Write the word SUK inside the search place")
    public void suk_search ()
    {
        search.Dynamic_search().sendKeys("M8_HTC_5L");

    }
    @Then("Click The search button in dynamic list drop")
    public void dynamic ()
    {
        List<WebElement> SUK =Hooks.driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"]"));
        SUK.get(0).click();
    }
    @And("Verify the product SUK inside the page")
    public void  Verify_the_product ()
    {
       String SKU_PRODUCT = Hooks.driver.findElement(By.cssSelector("span[class=\"value\"]")).getText();
        Assert.assertTrue(SKU_PRODUCT.contains("M8_HTC_5L"));

    }
}
