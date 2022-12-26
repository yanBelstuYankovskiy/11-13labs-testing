package com.epam.ta.page;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends AbstractPage {
	
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://www.amd.by/";
	private final String incorectSearch="vjybnjh";
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div[1]")
	private WebElement Electonica;
	
	@FindBy(xpath = "/html/body/div[13]/div[2]/div/div/div[1]/div/div[1]/div/div/div[2]/div[2]/div[2]/div[2]")
	private WebElement favouriteOnProduct;
	
	@FindBy(xpath = "/html/body/div[4]/header/div/div/div[2]/div[3]/a[3]/div")
	private WebElement linkFavourite;
	
	@FindBy(xpath = "/html/body/div[20]/div/div/div/div[2]/div[1]")
	private WebElement officalCompany;
	
	@FindBy(xpath = "/html/body/div[22]/div/div[2]/button")
	private WebElement cookiesButton;
	
	@FindBy(xpath = "/html/body/div[4]/header/div/div/div[1]/div[2]/div/form/input")
	private WebElement StartMenu;
	
	@FindBy(xpath = "/html/body/div[23]/div/div[1]/div/div/form/input")
	private WebElement InputMenu;
	
	@FindBy(xpath = "/html/body/div[23]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/a")
	private WebElement LinkMonitor;
	
	
	@FindBy(xpath = "/html/body/div[9]/div/a[1]")
	private WebElement linkConfigurationPC;
	
	@FindBy(xpath = "/html/body/footer/div/div/div[1]/div[2]/div[2]/a[3]")
	private WebElement dost;

	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public MainPage openPage() throws InterruptedException {
		driver.navigate().to(BASE_URL);
		logger.info("model mainPage opened");
		return this;
	}
	
	public void clickCookiesBox() throws InterruptedException{
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(cookiesButton));
		new Actions(driver).moveToElement(cookiesButton).click().build().perform();
		logger.info("Click to cookies button");
		Thread.sleep(3000);
	}
	
	
	public String clickElectronica () throws InterruptedException
	{
		clickCookiesBox();
		Thread.sleep(3000);
		Electonica.click();
		logger.info("Click electronica, page opened");
		return  driver.getCurrentUrl();
	}
	
	public String clickFavourite() throws InterruptedException{
		clickCookiesBox();
		Thread.sleep(5000);
		favouriteOnProduct.click();
		logger.info("Click button FAVOURITE on product");
		linkFavourite.click();
		logger.info("Click button FAVOURITE on header site");
		Thread.sleep(5000);
		return  driver.getCurrentUrl();
	}
	
	
	

	public String clickOfficialCompany() throws InterruptedException{
		clickCookiesBox();
		officalCompany.click();
		logger.info("Click to logo logo official company");
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
	public String searchMonitor(String search) throws InterruptedException{
		clickCookiesBox();
		Thread.sleep(5000);
		StartMenu.click();
		logger.info("Click to  website menu");
		Thread.sleep(1000);
		InputMenu.click();
		Thread.sleep(3000);
		InputMenu.sendKeys(search);
		logger.info("Input search text");
		Thread.sleep(3000);
		LinkMonitor.click();
		Thread.sleep(5000);
		logger.info("change page website");
		return driver.getCurrentUrl();
	}
	
	public String searchConfigurationPC() throws InterruptedException{
		clickCookiesBox();
		linkConfigurationPC.click();
		logger.info("Click to  linkConfiguration");
		return driver.getCurrentUrl();
	}
	
	public String dost() throws InterruptedException{
		Thread.sleep(5000);
		dost.click();
		logger.info("Click to  website menu");
		return driver.getCurrentUrl();
	}

}
