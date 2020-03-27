package com.automationpractice.retail.helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHelper {
	
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(ActionHelper.class);

	public ActionHelper(WebDriver driver) {
		this.driver = driver;
		log.info("WaitHelper object created..");
	}
	
	
	public void mouseHoverOnElement(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();	
	}
	

}
