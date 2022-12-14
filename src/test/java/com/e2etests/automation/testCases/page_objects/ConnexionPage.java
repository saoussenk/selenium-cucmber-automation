package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class ConnexionPage {
	
	public ConnexionPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	/* @FindBy */
	@FindBy(how = How.ID, using = "userName")
	public static WebElement userName;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login")
	public static WebElement BtnConnexion;

	

	/* Methods */
	public void openUrl(String url) {
		Setup.getDriver().get(url);
	}

	public void maximizeBrowser() {
		Setup.getDriver().manage().window().maximize();
	}

	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void BtnConnexion() {
		BtnConnexion.click();
	}

}
