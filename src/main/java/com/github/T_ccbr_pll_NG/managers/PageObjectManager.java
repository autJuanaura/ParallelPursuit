package com.github.T_ccbr_pll_NG.managers;

import org.openqa.selenium.WebDriver;

import com.github.T_ccbr_pll_NG.pages.HomePage;
import com.github.T_ccbr_pll_NG.pages.LogInPage;

public class PageObjectManager {

	private WebDriver webDriver;

	private HomePage homePage;
	private LogInPage loginPage;

	public PageObjectManager(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	// Short Hand If...Else
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
	}

	// General If...Else
	public LogInPage getLoginPage() {

		if (loginPage == null) {
			loginPage = new LogInPage(webDriver);
		}
		return loginPage;
	}

}
