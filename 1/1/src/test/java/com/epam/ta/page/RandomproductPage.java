package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class RandomproductPage extends AbstractPage{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL="https://shop.tesla.com/product/wall-connector";
    @FindBy(xpath = "//a[@aria-label='See your cart']")
    private WebElement Cart;
    @FindBy(xpath = "//input[@value='Add to Cart']")
    private WebElement buttonaddtocart;
    @FindBy(xpath = "//button[@class='tds-btn tds-btn--primary']")
    private WebElement buttonchechout;
    @FindBy(xpath = "//a[text()='Remove']")
    private WebElement Remove;
    @FindBy(xpath = "//button[text()='Yes, Remove']")
    private WebElement btnRemove;
    @FindBy(xpath = "//p[text()='Your cart is empty']")
    private WebElement pempty;
    @FindBy(xpath = "//div[@class='tds-tooltip-wrapper tds-tooltip-wrapper--inline']//button")
    private WebElement btncount;
    @FindBy(id = "1-2")
    private WebElement count2;
    @FindBy(xpath = "//div[@class='tds-tooltip-wrapper tds-tooltip-wrapper--inline']//span")
    private WebElement count;
    public RandomproductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public RandomproductPage openPage() throws InterruptedException {
        driver.navigate().to(PAGE_URL);
        logger.info("Shop page opened");
        sleep(10000);
        return this;
    }
    public RandomproductPage clicktoadd() {
        buttonaddtocart.click();
        logger.info("Click logo and title page opened");

        return  this;
    }
    public RandomproductPage openCart() throws InterruptedException {
        Cart.click();
        logger.info("Click Cart and Cart page opened");
        sleep(10000);
        return this;
    }
    public boolean DeleteCart() throws InterruptedException {
        Remove.click();
        logger.info("Click Remove and delete think");
        btnRemove.click();
        sleep(5000);
        if (pempty!=null)
        return true;
        else
            return false;

    }
    public boolean Editcount() throws InterruptedException {
        btncount.click();
        count2.click();

        sleep(5000);
        return true;

    }
    public boolean checkCart() throws InterruptedException {
        if(buttonchechout != null){
            return true;
        }
        else {
        return false;
        }
    }
}
