package com.automationpractice.retail.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automationpractice.retail.helper.ResourceHelper;

public class VerificationHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(VerificationHelper.class);
	
	public VerificationHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public boolean isDisplayed(WebElement element){
		try{
			element.isDisplayed();
			log.info("element is Displayed.."+element.getText());
		//	TestBase.logExtentReport("element is Displayed.."+element.getText());
			return true;
		}
		catch(Exception e){
			log.error("element is not Displayed..", e.getCause());
		//	TestBase.logExtentReport("element is not Displayed.."+e.getMessage());
			return false;
		}
	}
	
	public boolean isNotDisplayed(WebElement element){
		try{
			element.isDisplayed();
			log.info("element is present.."+element.getText());
			//TestBase.logExtentReport("element is present.."+element.getText());
			return false;
		}
		catch(Exception e){
			log.error("element is not present..");
			return true;
		}
	}
	
	public boolean isEnabled(WebElement element) {
		try {
			if(element.isEnabled()) {
				log.info(element.getText()+" element is ENABLED");
				return true;
			}else {
				log.error(element.getText()+" element is NOT ENABLED");
				return false;
			}
		} catch (Exception e) {
			log.error(element.getText()+" element is NOT ENABLED");
			return false;
		}
	}

	public boolean isNotEnabled(WebElement element) {
		try {
			element.isEnabled();
			log.info(element.getText()+" element is NOT ENABLED");
			return false;
		} catch (Exception e) {
			log.error(element.getText()+" element is ENABLED");
			return true;
		}
	}

	
	public String readValueFromElement(WebElement element){
		if(null == element){
			log.info("WebElement is null..");
			return null;
		}
		boolean status = isDisplayed(element);
		if(status){
			log.info("element text is .."+element.getText());
			return element.getText();
		}
		else{
			return null;
		}
	}
	public String getText(WebElement element){
		if(null == element){
			log.info("WebElement is null..");
			return null;
		}
		boolean status = isDisplayed(element);
		if(status){
			log.info("element text is .."+element.getText());
			return element.getText();
		}
		else{
			return null;
		}
	}
	
	public String getTitle(){
		log.info("page title is: "+driver.getTitle());
		return driver.getTitle();
	}
	
	public boolean isTextMatching(String...strings) {
		int size = strings.length;
		boolean status = false;
		for(int i=0; i<size-1; i++) {
			int j=i+1;
			status = strings[i].equalsIgnoreCase(strings[j]);
			System.out.println("Comparison String1 = "+ strings[i]+";Comparison String2 = "+ strings[j]+ "; Matching?:- "+status);
		}
		return status;
	}
}
