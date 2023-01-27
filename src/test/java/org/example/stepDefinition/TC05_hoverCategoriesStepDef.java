package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static org.example.stepDefinition.Hooks.driver;

public class TC05_hoverCategoriesStepDef {

    P03_homePage Hover = new P03_homePage();

    @Given("you need to select computer from main categories and hover it")
    public void hover_main_categories() throws InterruptedException {

        WebElement computer_categories = driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(computer_categories).perform();
       WebElement sub_categories = driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
       act.moveToElement(sub_categories).click().build().perform();

    }
    @Then("Assert that the sub-category title")
    public void Assert_that_the_sub_category ()
    {
        String Assert_that_the_sub_category = driver.findElement(By.linkText("Desktops")).getText();
        Assert.assertTrue(Assert_that_the_sub_category.contains("Desktops"));

    }
}





