package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingInventoryPage extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://www.tesla.com/inventory/new/m3?arrangeby=relevance&zip=95113&range=200";

    @FindBy(xpath = "//a[@aria-label='Tesla Logo']")
    private WebElement Logo;
    public ExistingInventoryPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ExistingInventoryPage openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Existing Inventory page opened");
        return this;
    }

    public String clicklogo()
    {
        Logo.click();
        logger.info("Click logo and title page opened");
        return  driver.getCurrentUrl();
    }
}
