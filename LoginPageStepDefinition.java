package com.automation.steps;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.automation.config.LocalDriverManager;
import com.automation.config.SeleniumNGSuite;
import com.automation.exception.AutomationException;
import com.automation.pageobjects.HomePage;
import com.automation.pageobjects.KrishaLoginPage;
import com.automation.pageobjects.LoginPag127;
import com.automation.pageobjects.LoginPage;
import com.automation.pageobjects.ManojLoginPage;
import com.automation.pageobjects.SaketLoginPage;
import com.automation.pageobjects.ShivaPage;
import com.automation.pageobjects.SirishaLoginPage;
import com.automation.utils.DriverUtilsImpl;
import com.automation.utils.LocalTestDataManager;
//import com.automation.utils.DriverUtilsImpl;
import com.automation.utils.TestDataUtils;
import com.automation.utils.TestResultsUtils;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class LoginPageStepDefinition extends TestDataUtils{


	DriverUtilsImpl reusablemethods = new DriverUtilsImpl();
	/** The logger. */
	private static final Logger LOG = LoggerFactory.getLogger(LoginPageStepDefinition.class);

	TestResultsUtils testResultUtilities = new TestResultsUtils();
	ShivaPage LObj;
	
	@Given("^user is on glogin screen$")
    public void user_is_on_glogin_screen() throws Throwable {
     SeleniumNGSuite obj = new SeleniumNGSuite();
     obj.setUpSuite("Web");
		
		
    }


    @When("^user enters credentails$")
    public void user_enters_credentails() throws Throwable {
    
    	reusablemethods.sendText(LoginPage.uname, "rtyui");
    	reusablemethods.sendText(LoginPage.pswd, "234");
    

    	
    }
    

    @Then("^user clicks on login button$")
    public void user_clicks_on_lagin_button() throws Throwable {
    	reusablemethods.gClick(LoginPage.loginBtn);
    }

    
	 @Given("^user is on login screen$")
	    public void user_is_on_login_screen() throws Throwable {
	     //launch the browser n open tje app
		 try{
		 SeleniumNGSuite obj = new SeleniumNGSuite();
		 obj.setUpSuite("Web");
		 testResultUtilities.logger.log(LogStatus.PASS, "Opened app on the brwser");
		 }catch(Throwable e){
			 testResultUtilities.logger.log(LogStatus.FAIL, "unable to open the browser"); 
		 }
	    }
	
	 @When("^user enters uname, pswd$")
	 public void user_enters_uname_pswd() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 reusablemethods.sendText(KrishaLoginPage.uname, "gopal");
		 reusablemethods.sendText(KrishaLoginPage.pswd, "1234");
		 
	 }

	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		 reusablemethods.gClick(KrishaLoginPage.login);
	 }
}
	
