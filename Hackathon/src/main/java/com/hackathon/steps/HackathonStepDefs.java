package com.hackathon.steps;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;

import com.hackathon.pages.HackathonPages;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.quantum.utils.DeviceUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@QAFTestStepProvider
public class HackathonStepDefs {
	@Given("Launch Hackathon Page with \"([^\"]*)\"")
	public void LaunchHackathonPage(String url) {
		HackathonPages.launchHackathon(url);
	}
	
	
	@Then("Click on Click Here button")
		public void ClicktoNavigate() {
			HackathonPages.navigatetoRegisteredEmployees();
		}
	
	@Then("verify that Registered Employees Page is displayed")
	public void validateRegisterationPage() {
		HackathonPages.validateRegisteredEmployeePage();
	}
	
	@Then("Click on Add Employee button")
	public void addEmployeeNavigation() {
		HackathonPages.addEmployeeNavigation();
	}
	
	@Then("Enter details in Employee Registration Page \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"")
	public void fillEmployeeRegistartion(String EmpID  , String Name, String Project, String PhoneNumber, String location ) {
		HackathonPages.employeeRegistration(EmpID, Name,Project, PhoneNumber,location );
		
	}
	
	@Then("Enter details and validate Error message \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"")
	public void errorMessageValidation(String EmpID2  , String Name2, String Project2, String PhoneNumber2) {
		HackathonPages.errorMessageValidation(EmpID2, Name2, Project2, PhoneNumber2 );
		
	
	}
}
