package com.automationpractice.retail.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.helper.LoggerHelper;
import com.automationpractice.retail.helper.VerificationHelper;
import com.automationpractice.retail.helper.WaitHelper;

public class PaymentPage {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(PaymentPage.class);
	WaitHelper waitHelper;

	public PaymentPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy (xpath="//*[@title='Pay by bank wire']")
	WebElement link_payByBank;

	@FindBy (xpath="//*[@title='Pay by check.']")
	WebElement link_payByCheque;


	@FindBy (xpath="//*[@class='button btn btn-default button-medium']")
	WebElement btn_confirmOrder;

	@FindBy(xpath="//*[contains(text(),'Your order on My Store is complete.')]")
	WebElement txt_OrderConfirmation; 

	@FindBy(xpath="//*[@class='box']")
	WebElement txt_orderId; 



	public void clickOnPayByBankWire() {

		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(link_payByBank, 10);

		JavascriptExecutor js = (JavascriptExecutor)driver;	

		js.executeScript("arguments[0].scrollIntoView();", link_payByBank);

		js.executeScript("arguments[0].click();", link_payByBank);

	}

	public void clickOnPayByCheque() {


		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(link_payByCheque, 10);

		JavascriptExecutor js = (JavascriptExecutor)driver;	

		js.executeScript("arguments[0].scrollIntoView();", link_payByCheque);

		js.executeScript("arguments[0].click();", link_payByCheque);


	}

	public void clickOnConfirmOrder() {


		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(btn_confirmOrder, 10);

		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();", btn_confirmOrder);

		js.executeScript("arguments[0].click();", btn_confirmOrder);

	}

	public void verifyOrderConfirmationText() {
		VerificationHelper verificationHelper = new VerificationHelper(driver);
		verificationHelper.isDisplayed(txt_OrderConfirmation);
	}


	public String getOrderId() {
		String orderText = txt_orderId.getAttribute("innerText");

		String[] words=orderText.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
		
		String orderId = words[36];
		
		return orderId;

	}






}
