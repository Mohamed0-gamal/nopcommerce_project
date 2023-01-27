package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefinition.Hooks.driver;

public class TC07_followUsStepDef {
    P03_homePage  follow = new P03_homePage();

    @Given("user opens facebook link")
    public void open_facebook () throws InterruptedException {
        follow.facebook_button().click();
        Thread.sleep(5000);


    }
    @Then("www.facebook\" is opened in new tab")
    public void verify_opening ()
    {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    @Given("user opens twitter link")
    public void open_twitter () throws InterruptedException {
        follow.twitter_button().click();
        Thread.sleep(5000);




    }
    @Then("verify twitter is opened in new tab")
    public void verify_opening_twitter ()
    {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    @Given("user opens rss link")
    public void open_RSS () throws InterruptedException {
        follow.rss_button().click();
        Thread.sleep(5000);
    }
    @Then("verify rss is opened in new tab")
    public void verify_opening_rss ()
    {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    @Given("user opens youtube link")
    public void open_youtube () throws InterruptedException {
        follow.youtube_button().click();
        Thread.sleep(5000);




    }
    @Then("verify youtube is opened in new tab")
    public void verify_opening_youtube ()
    {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }



}
