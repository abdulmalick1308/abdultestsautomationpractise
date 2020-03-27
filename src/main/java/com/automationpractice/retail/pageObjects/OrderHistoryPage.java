package com.automationpractice.retail.pageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.helper.LoggerHelper;
import com.automationpractice.retail.helper.WaitHelper;

public class OrderHistoryPage {
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(OrderHistoryPage.class);
	WaitHelper waitHelper;

	public OrderHistoryPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath="//*[@class='history_link bold footable-first-column'][1]")
	WebElement cell_LatestOrderId;
	
	
	public String getOrderId () {
		String webOrderId = cell_LatestOrderId.getText();
		return webOrderId;
		
	}
	

}
