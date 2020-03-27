package com.automationpractice.retail.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.helper.LoggerHelper;
import com.automationpractice.retail.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
		
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	WebElement link_signIn; 
	
	@FindBy (xpath="//*[@id='email']")
	WebElement txtBox_email;
	
	@FindBy (xpath="//*[@id='passwd']")
	WebElement txtBox_pwd;
	
	@FindBy (xpath="//*[@id='SubmitLogin']")
	WebElement btn_signIn;
	
	
	public void clickOnSignInLink(){
		link_signIn.click();
	}
	
	
	public  void enterEmail(String username) {
		txtBox_email.sendKeys(username);
	}
	
	public  void enterPwd(String password) {
		txtBox_pwd.sendKeys(password);
	}
	
	
	public void clickOnSignInButton() {
		btn_signIn.click();
	}
	
	

}