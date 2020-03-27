package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.retail.pageObjects.AddressDetailsPage;
import com.automationpractice.retail.pageObjects.HomePage;
import com.automationpractice.retail.pageObjects.LoginPage;
import com.automationpractice.retail.pageObjects.OrderHistoryPage;
import com.automationpractice.retail.pageObjects.PaymentPage;
import com.automationpractice.retail.pageObjects.ShippingPage;
import com.automationpractice.retail.pageObjects.SummaryPage;
import com.automationpractice.retail.pageObjects.TShirtListingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestOrder { 

	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	TShirtListingPage tShirtListingPage;
	SummaryPage summaryPage;
	AddressDetailsPage addressDetailsPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;
	OrderHistoryPage orderHistoryPage;




	public static String getResourcePath() {

		String path ="src/main/resources//chromedriver.exe";
		String basePath = System.getProperty("user.dir");
		System.out.println(basePath +"/"+ path);
		return basePath +"/"+ path;

	}



	@Given("^Open Chrome and start the test application$")
	public void open_Chrome_and_start_the_test_application() {

		System.setProperty("webdriver.chrome.driver",getResourcePath());


		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_user_name_and_password(String username, String password ) {

		loginPage = new LoginPage(driver);
		loginPage.clickOnSignInLink();
		loginPage.enterEmail(username);
		loginPage.enterPwd(password);
		loginPage.clickOnSignInButton();

	}


	@When("^I Click on T Shirt Link$")
	public void i_Click_on_T_Shirt_Link() {

		homePage = new HomePage(driver);
		homePage.clickOnTShirt();

	}

	@When("^I add a T Shirt to the cart$")
	public void i_add_a_T_Shirt_to_the_cart() throws InterruptedException {

		tShirtListingPage = new TShirtListingPage (driver);
		tShirtListingPage.clickOnAddToCart();
		tShirtListingPage.clickOnCheckOutButton();

	}

	@When("^I click onm Proceed to Checkout$")
	public void i_click_onm_Proceed_to_Checkout() throws InterruptedException {
		summaryPage = new SummaryPage(driver);
		summaryPage.clickOnCheckOutButton();
	}

	@When("^I proceed to checkout without updating address$")
	public void i_proceed_to_checkout_without_updating_address() throws InterruptedException {
		addressDetailsPage = new AddressDetailsPage(driver);
		addressDetailsPage.clickOnCheckOutButton();
	}

	@When("^I check terms and conditions in shipping$")
	public void i_check_terms_and_conditions_in_shipping() throws InterruptedException {
		shippingPage = new ShippingPage(driver);
		shippingPage.checkTermsAndConditions();
		shippingPage.clickOnCheckOutButton();

	}

	@When("^I pay by bank wire$")
	public void i_pay_by_bank_wire() {
		paymentPage = new PaymentPage(driver);
		paymentPage.clickOnPayByBankWire();
		paymentPage.clickOnConfirmOrder();

	}

	@When("^cofirm my order$")
	public String cofirm_my_order() {
		paymentPage.verifyOrderConfirmationText();
		String orderId = paymentPage.getOrderId();
		return orderId;
	}

	@Then("^user should be able verify the order in order history$")
	public String user_should_be_able_verify_the_order_in_order_history() {

		homePage = new HomePage(driver);
		homePage.clickOnAccountsLinkAtTop();
		homePage.clickOnOrderHistoiry();

		orderHistoryPage = new OrderHistoryPage(driver);
		String webTableOrderId = orderHistoryPage.getOrderId();
		return  webTableOrderId;
		
	}


@Then("^orderId should match$")
public void orderid_should_match() {
if (user_should_be_able_verify_the_order_in_order_history().equalsIgnoreCase(cofirm_my_order()) ) {
	System.out.println("The test is passed");
}
else {
	System.out.println("The test has failed");
}
	
}








}
