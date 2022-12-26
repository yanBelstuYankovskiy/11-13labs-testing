package com.epam.ta.page;

import com.epam.ta.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class Singin extends AbstractPage
{
    private final Logger logger = LogManager.getRootLogger();
    private final String PAGE_URL = "https://www.amd.by/login/";
    
    @FindBy(xpath = "/html/body/div[10]/div/div/div/div[2]/div/form/div[1]/input")
    private WebElement email;
    @FindBy(xpath = "/html/body/div[10]/div/div/div/div[2]/div/form/div[1]/input")
    private WebElement password;
    
    @FindBy(xpath = "/html/body/div[10]/div/div/div/div[2]/div/form/input")
    private WebElement btnnxt;
    
    
    public Singin(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public Singin openPage()
    {
        driver.navigate().to(PAGE_URL);
        logger.info("Singin 3 page opened");
        return this;
    }
    public Singin emailclick(User user) throws InterruptedException {
        email.sendKeys(user.getUsername());
        btnnxt.click();
        logger.info("emailclick");
        sleep(10000);
        return  this;
    }
}
