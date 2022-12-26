package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://shop.tesla.com/";
    private final String RANDOM_PRODUCT_URL="https://shop.tesla.com/search?searchTerm=model";
    private final String RANDOM_PRODUCT_URL_1="https://shop.tesla.com/search?searchTerm=at+home";
    @FindBy(xpath = "//a[@aria-label='Tesla Motors']")
    private WebElement Logo;
    @FindBy(xpath = "//ul[@class='product-title_list']")
    private WebElement list;
    public ShopPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShopPage openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Shop page opened");
        return this;
    }
    public ShopPage openRandomPage()
    {
        driver.navigate().to(RANDOM_PRODUCT_URL);
        logger.info("Shop random page opened");
        return this;
    }
    public ShopPage openRandomPage1()
    {
        driver.navigate().to(RANDOM_PRODUCT_URL_1);
        logger.info("Shop random page opened");
        return this;
    }
    public String clicklogo()
    {
        Logo.click();
        logger.info("Click logo and title page opened");
        return  driver.getCurrentUrl();
    }
    public boolean cheacfindlist()
    {
        if(list!=null)
            return true;
        else
            return false;
    }
}
