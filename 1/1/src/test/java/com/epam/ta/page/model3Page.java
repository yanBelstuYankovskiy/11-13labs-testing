package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class model3Page extends AbstractPage
{
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://www.tesla.com/model3";
	@FindBy(xpath = "//a[@aria-label='Tesla Logo']")
	private WebElement Logo;
	public model3Page(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public model3Page openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("model 3 page opened");
		return this;
	}
	public String clicklogo()
	{
		Logo.click();
		logger.info("Click logo and title page opened");
		return  driver.getCurrentUrl();
	}
}
