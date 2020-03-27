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

public class TShirtListingPage {
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(TShirtListingPage.class);
	WaitHelper waitHelper;
		
	public TShirtListingPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath="//*[@title='Faded Short Sleeve T-shirts']")
	WebElement img_ShortSleeve;
	
	@FindBy(xpath="//*[contains(text(),'Add to cart')]")
	WebElement btn_addToCart; 
	
	@FindBy(xpath="//*[contains(text(),'Proceed to checkout')]")
	WebElement btn_checkout; 
	


	
	
	public void mouseHoverOnShortSleeve() {
		ActionHelper actionHelper = new ActionHelper(driver);
		actionHelper.mouseHoverOnElement(img_ShortSleeve);
		
	}
	
	public void clickOnAddToCart() {
		

		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		js.executeScript("arguments[0].click();", btn_addToCart);
	
	}
	
	public void clickOnCheckOutButton() throws InterruptedException {
		
		WaitHelper waitHelper = new WaitHelper (driver);
		waitHelper.setImplicitWait(10, TimeUnit.SECONDS);
		
		JavaScriptHelper javaScriptHelper = new JavaScriptHelper(driver);
		javaScriptHelper.scrollToElementAndClick(btn_checkout);
		
		
	
	}


	
	
}
