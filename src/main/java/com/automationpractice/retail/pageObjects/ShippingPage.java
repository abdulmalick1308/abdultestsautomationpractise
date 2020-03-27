package com.automationpractice.retail.pageObjects;

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

public class ShippingPage {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(ShippingPage.class);
	WaitHelper waitHelper;

	public ShippingPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(name="processCarrier")
	WebElement btn_checkout; 
	

	@FindBy (xpath="//*[@id='cgv']")
	WebElement chkBox_tAndC;




	public void clickOnCheckOutButton() throws InterruptedException {


		JavaScriptHelper javaScriptHelper = new JavaScriptHelper(driver);
		javaScriptHelper.scrollToElementAndClick(btn_checkout);


	}

	public void checkTermsAndConditions() throws InterruptedException {

		Thread.sleep(5000);
		chkBox_tAndC.click();
		



	}






}
