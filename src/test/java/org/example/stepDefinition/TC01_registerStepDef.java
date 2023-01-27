package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_registerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class TC01_registerStepDef {
    P01_registerPage register = new P01_registerPage();
    @And("user go to register page")
    public void register ()
    {
     register.registerPage().click();
    }
    @When("select gender type")
    public void gender ()
    {
     register.gender().click();
    }
    @And("user enter first name \"automation\" and last name \"tester\"")
    public void name()
    {
      register.FirstName().sendKeys("automation2");
      register.LastName().sendKeys("tester2");
    }
    @And("user enter date of birth")
    public void date ()
    {
      WebElement ListDay= Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select DropDown = new Select(ListDay);
       DropDown.selectByValue("9");
        WebElement ListMonth= Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
       DropDown = new Select(ListMonth);
        DropDown.selectByValue("7");
        WebElement ListYear= Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
       DropDown = new Select(ListYear);
        DropDown.selectByValue("1996");




    }
    @And("user enter email \"test@example.com\" field")
    public void email()
    {
      register.email().sendKeys("test123@example.com");
    }
@And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void password()
    {
        register.password().sendKeys("P@ssw0rd10");
    }
    @And("user confirm the password")
    public void confirm ()
    {
register.CONFIRM().sendKeys("P@ssw0rd10");
    }
@And("user clicks on register button")
    public void register_button()
{
       register.register_but().click();
}
@Then("success message is displayed")
    public void success()
{
    SoftAssert soft = new SoftAssert();
    soft.assertAll();
   String SuccessMassage = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
    soft.assertTrue(SuccessMassage.contains("Your registration completed"));


}
}
