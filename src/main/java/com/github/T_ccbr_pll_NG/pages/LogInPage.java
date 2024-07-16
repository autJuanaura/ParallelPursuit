package com.github.T_ccbr_pll_NG.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

	public LogInPage(WebDriver miDriver) {
		super(miDriver);
	}

	@FindBy(css = "[placeholder='USERNAME']")
	private WebElement usrInput;
	@FindBy(css = "[placeholder='PASSWORD']")
	private WebElement psswdInput;
	@FindBy(css = "[class='btn-signin']")
	private WebElement signInButton;

	public void setCredentials(String username, String psswd) {
		setUserName(username);
		setPsswd(psswd);
		clickOnButton();
	}

	public void setUserName(String username) {
		usrInput.sendKeys(username);
	}

	public void clickOnButton() {
		signInButton.click();
	}

	public void setPsswd(String psswd) {
		psswdInput.sendKeys(psswd);

	}

}
