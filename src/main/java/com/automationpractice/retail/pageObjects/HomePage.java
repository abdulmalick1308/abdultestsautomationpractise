package com.automationpractice.retail.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.helper.LoggerHelper;
import com.automationpractice.retail.helper.WaitHelper;

public class HomePage {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(HomePage.class);
	WaitHelper waitHelper;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@title='T-shirts']")
	WebElement link_tShirts; 

	@FindBy(xpath="//*[contains(text(),'Order history and details')]")
	WebElement link_orderHistory;  

	@FindBy(xpath="//*[contains(text(),'My personal information')]")
	WebElement link_personalInformation;  

	@FindBy (xpath="//*[@title='View my customer account']")
	WebElement link_accounts;




	public void clickOnTShirt() {

		JavascriptExecutor js = (JavascriptExecutor)driver;	

		//Perform Click on LOGIN button using JavascriptExecutor		
		js.executeScript("arguments[0].click();", link_tShirts);


	}

	public void clickOnOrderHistoiry() {
		link_orderHistory.click();
	}

	public void clickOnPersonalInfo() {
		link_personalInformation.click();
	}

	public void clickOnAccountsLinkAtTop() {
		link_accounts.click();
	}

}