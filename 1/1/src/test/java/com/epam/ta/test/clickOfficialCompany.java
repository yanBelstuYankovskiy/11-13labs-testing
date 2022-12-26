package com.epam.ta.test;

import com.epam.ta.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clickOfficialCompany  extends CommonConditions{
	@Test
	public void Logofirst() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage()
				.clickOfficialCompany();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/",loggedInUserName);
	}
	
	@Test
	public void Logosecond() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage()
				.clickElectronica();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/",loggedInUserName);
	}
	
	
	@Test
	public void Logothird() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage().
				clickFavourite();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/login/",loggedInUserName);
	}
	
	
	@Test
	public void Logofourth() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage().
				searchMonitor("монитор");
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/monitory/?q=%D0%BC%D0%BE%D0%BD%D0%B8%D1%82%D0%BE%D1%80",loggedInUserName);
	}
	
	
	
	@Test
	public void Logofifth() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage().
				searchConfigurationPC();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/configurator/",loggedInUserName);
	}
	
	@Test
	public void Logosix() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage().
				searchMonitor("ntktdbpj");
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/televizory/?q=%D1%82%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D0%B7%D0%BE",loggedInUserName);
	}
	
	@Test
	public void LogoSeven() throws InterruptedException
	{
		String loggedInUserName = new MonitorPage(driver)
				.openPage().
				clickSorting();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/televizory/?q=%D1%82%D0%B5%D0%BB%D0%B5%D0%B2%D0%B8%D0%B7%D0%BE%D1%80",loggedInUserName);
	}
	
	@Test
	public void LogoEight() throws InterruptedException
	{
		String loggedInUserName = new MonitorPage(driver)
				.openPage().
				clickSeils();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/phone/?q=%D1%82%D0%B5%D0%BB%D0%B5%D0%B2%D0%B6%A3%F7%D0%AE%B4%10",loggedInUserName);
	}
	
	@Test
	public void LogoNine() throws InterruptedException
	{
		String loggedInUserName = new MainPage(driver)
				.openPage().
				dost();
		System.out.println(loggedInUserName);
		Assert.assertEquals("https://www.amd.by/",loggedInUserName);
	}
	
	

}
