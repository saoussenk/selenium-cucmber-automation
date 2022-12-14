package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AlertPage {
	
	/* @FindBy */
	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement alertButton;

	public AlertPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void openUrl(String url) {
		Setup.getDriver().get(url);
	}
	
	public void maximizeBrowser() {
		Setup.getDriver().manage().window().maximize();
	}
	
	public void clickOnAlertButton(){
		alertButton.click();
	}
	
	public void switchAlert() {
		Setup.getDriver().switchTo().alert().accept();
	}
	
	public void checkTitle() {
		String title = Setup.getDriver().getTitle(); 
		System.out.println("the title of application is: "+ title);
	}

}
