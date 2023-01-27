package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_registerPage {
    public WebElement registerPage ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
    public WebElement gender()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement FirstName ()
    {
        return Hooks.driver.findElement(By.cssSelector("input[data-val=\"true\"]"));
    }
    public WebElement LastName (){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"LastName\"]"));
    }
    public WebElement email ()
    {
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Email is required.\"]"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Password is required.\"]"));
    }
    public WebElement CONFIRM ()
    {
       return Hooks.driver.findElement(By.cssSelector("input[data-val-equalto=\"The password and confirmation password do not match.\"]"));
    }

    public WebElement register_but ()
    {
        return Hooks.driver.findElement(By.cssSelector("button[id=\"register-button\"]"));
    }
}
