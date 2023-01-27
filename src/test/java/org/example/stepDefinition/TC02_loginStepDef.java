package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TC02_loginStepDef {
P02_loginPage login = new P02_loginPage();
   @Given("user go to login page")
    public void  page ()
{
 login.loginPage().click();
}
    @When("user login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")
    public void email_and_password ()
{
  login.email().sendKeys("test123@example.com");
  login.password().sendKeys("P@ssw0rd10");
}
    @And("user press on login button")
    public void press_button ()
{
 login.press_login_button().click();
}
    @Then("user login to the system successfully")
    public void login_successful ()
{
    SoftAssert soft = new SoftAssert();
    soft.assertAll();
    WebElement logout = Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"]"));
    soft .assertTrue(logout.isDisplayed());

}
    @Given("user go to login page.")
    public void log ()
    {
      login.LOGIN().click();
    }
    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void wrong_email_password ()
    {
        login.wrong_email().sendKeys("test123@example.com");
        login.wrong_password().sendKeys("P@ssw0rd10");
    }
   @And("user press TO login button")
    public void login_button ()
   {
     login.login_button() .click();
   }
   @Then("user could not login to the system")
    public void unsuccessful_login ()
   {
     SoftAssert soft = new SoftAssert();
       soft.assertAll();
       //error message contains "Login was unsuccessful."
     String error_massage =Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
     soft.assertTrue(error_massage.contains("Login was unsuccessful."));
     // the color of this message is red "#e4434b"
    String Error_color= Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getCssValue("color");
     soft.assertEquals(Error_color,"#e4434b");

   }

}
