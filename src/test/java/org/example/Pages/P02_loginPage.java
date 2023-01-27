package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_loginPage {
public WebElement loginPage ()
{
    return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
}
public WebElement email ()
{
    return  Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
}
    public WebElement password ()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement press_login_button ()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement LOGIN ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }
    public WebElement wrong_email ()
    {
        return  Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement wrong_password ()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement login_button ()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

}
