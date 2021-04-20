 package com.udacity.jwdnd.course1.clouldstorage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class ResultPage {
	// fields:
    @FindBy(tagName = "a")
    private WebElement backHomeLink;
    private final WebDriver driver;
    // constructor:
    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // methods:
    public void clickHereBtn() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", this.backHomeLink);
    }
}
