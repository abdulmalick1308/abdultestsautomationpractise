package com.automationpractice.retail.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.helper.ActionHelper;
import com.automationpractice.retail.helper.LoggerHelper;
import com.automationpractice.retail.helper.WaitHelper;

public class SummaryPage {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(SummaryPage.class);
	WaitHelper waitHelper;

	public SummaryPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath="//*[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")
	WebElement btn_checkout; 



	public void clickOnCheckOutButton() throws InterruptedException {


	
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", btn_checkout);


	}




}
