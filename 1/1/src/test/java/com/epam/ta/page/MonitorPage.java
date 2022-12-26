package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MonitorPage extends AbstractPage {
	
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://www.amd.by/monitory/?q=%D0%BC%D0%BE%D0%BD%D0%B8%D1%82%D0%BE%D1%80";
	
	
	
	public MonitorPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	@Override
	public MonitorPage openPage() throws InterruptedException {
		driver.navigate().to(BASE_URL);
		logger.info("model MonitorPage opened");
		Thread.sleep(4000);
		return this;
	}
	
	@FindBy(xpath = "/html/body/div[10]/div[2]/aside/div[1]/div[3]/div[2]/div/label[1]/input")
	private WebElement SeilsElement;
	
	@FindBy(xpath = "/html/body/div[10]/div[2]/div[2]/div[2]/div[2]/div/select/option[2]")
	private WebElement SortElement;
	
	public String clickSeils() throws InterruptedException{
		SeilsElement.click();
		logger.info("Click to Seils filter");
		Thread.sleep(5000);
		return driver.getCurrentUrl();
	}
	
	public String clickSorting() throws InterruptedException{
		Thread.sleep(2000);
		SortElement.click();
		logger.info("Click to Sort filter");
		return driver.getCurrentUrl();
	}

}
