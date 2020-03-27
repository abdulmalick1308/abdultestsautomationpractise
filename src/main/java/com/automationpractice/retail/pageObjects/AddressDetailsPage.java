package com.automationpractice.retail.pageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.helper.ActionHelper;
import com.automationpractice.retail.helper.JavaScriptHelper;
import com.automationpractice.retail.helper.LoggerHelper;
import com.automationpractice.retail.helper.WaitHelper;

public class AddressDetailsPage {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(AddressDetailsPage.class);
	WaitHelper waitHelper;

	public AddressDetailsPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(name="processAddress")
	WebElement btn_checkout; 



	public void clickOnCheckOutButton() throws InterruptedException {
		
		WaitHelper waitHelper = new WaitHelper (driver);
		waitHelper.setImplicitWait(10, TimeUnit.SECONDS);
		
		JavaScriptHelper javaScriptHelper = new JavaScriptHelper(driver);
		javaScriptHelper.scrollDownVertically();
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();", btn_checkout);

		js.executeScript("arguments[0].click();", btn_checkout);
		
		
	
	}




}
