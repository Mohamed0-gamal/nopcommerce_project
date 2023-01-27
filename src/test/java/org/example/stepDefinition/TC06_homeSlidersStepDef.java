package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class TC06_homeSlidersStepDef {
    P03_homePage Slider = new P03_homePage();
       @Given("click on first slider to direct user to this url")
    public void click_on_first_slider ()
       {
           Slider.SLIDER().click();

       }
       @Then("verify to this url")
    public void verify_url ()
       {
           SoftAssert soft = new SoftAssert();
           soft.assertAll();
           soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");

       }
       @Given("click on second slider to direct user to this url")
    public void click_on_second_slider ()
       {
           Slider.Second_slider().click();
       }
       @Then("verify to second url")
    public void verify_second_url ()
       {
           SoftAssert soft  = new SoftAssert();
           soft.assertAll();
           soft.assertEquals(Hooks.driver.getCurrentUrl()," https://demo.nopcommerce.com/iphone-6");

       }
}
