package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.compress.changes.ChangeSetPerformer;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import sun.nio.cs.Surrogate;

import java.text.MessageFormat;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefinition.Hooks.driver;

public class TC08_WishlistStepDef {
    P03_homePage wish = new P03_homePage();

    @Given("click on wishlist button ❤️ on this product \"HTC One M8 Android L 5.0 Lollipop")
    public void wishlist_button() throws InterruptedException {
        WebElement LIST = Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"] button[class=\"button-2 add-to-wishlist-button\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(LIST).click().build().perform();

    }

    @Then("verify success message and color is displayed")
    public void verify_success() throws InterruptedException {
        SoftAssert SOFT = new SoftAssert();
        String Success_Massage = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        SOFT.assertTrue(Success_Massage.contains("The product has been added to your "));
        String VERIFY_COLOR = driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getCssValue("background-color");
        SOFT.assertTrue(VERIFY_COLOR.contains("rgb(75 176 122)"));

    }
    @Given("click on wishlist button this product \"HTC One M8 Android L 5.0 Lollipop")
    public void CLICK ()
    {

        driver.findElement(By.cssSelector("div[data-productid=\"18\"] button[class=\"button-2 add-to-wishlist-button\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-productid=\"18\"] button[class=\"button-2 add-to-wishlist-button\"]")));
        wish.click_wishlist().click();
        SoftAssert soft_qty = new SoftAssert();
       soft_qty.assertAll();
       String qty = driver.findElement(By.cssSelector("input[value=\"1\"]")).getAttribute("value");
       soft_qty.assertEquals(qty,"2");
        System.out.println(qty);
       soft_qty.assertNotEquals(qty,"0");



    }

}
