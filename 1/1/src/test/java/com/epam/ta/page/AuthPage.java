package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://auth.tesla.com/oauth2/v1/authorize?redirect_uri=https%3A%2F%2Fwww.tesla.com%2Fteslaaccount%2Fowner-xp%2Fauth%2Fcallback&response_type=code&client_id=ownership&scope=offline_access%20openid%20ou_code%20email%20phone&audience=https%3A%2F%2Fownership.tesla.com%2F&locale=en-US/";

    @FindBy(xpath = "//a[@aria-label='Tesla Logo']")
    private WebElement Logo;

    public AuthPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AuthPage openPage() throws InterruptedException
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Auth page opened");
        Thread.sleep(6000);
        return this;
    }

    public String clicklogo() throws InterruptedException
    {
    	Thread.sleep(6000);
        Logo.click();
        logger.info("Click logo and title page opened");
        return  driver.getCurrentUrl();
    }

}
