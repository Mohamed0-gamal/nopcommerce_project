package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefinition.Hooks.driver;

public class P03_homePage {
public WebElement BOOK_WORD ()
{
    return Hooks.driver.findElement(By.cssSelector("input[type=\"text\"]"));
}
public WebElement search_clicl ()
{
    return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
}
public WebElement Dynamic_search ()
{
    return Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
}
public WebElement SLIDER ()
{
    return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-control active\"]"));
}
public WebElement Second_slider ()
{
    return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-control\"]"));
}
 public WebElement facebook_button ()
 {
     return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
 }
    public WebElement twitter_button ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rss_button ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement youtube_button ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public WebElement click_wishlist ()
    {
        return driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }
}
