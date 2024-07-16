package com.github.T_ccbr_pll_NG.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver miDriver) {
		super(miDriver);
	}

	@FindBy(css = "[class='logo-ais']")
	private WebElement logoHomePage;

	public boolean isTheLogoVisible() {
		return logoHomePage.isDisplayed();
	}

}
