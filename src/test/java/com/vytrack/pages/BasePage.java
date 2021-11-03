package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class BasePage {

    @FindBy (css = "div>h1>a")
    public WebElement HomePage;

    @FindBy (css = "div#main-menu")
    public List<WebElement> mainMenu;

    @FindBy (css = "span.title.title-level-1")
    public List<WebElement> menuOptions;





}
