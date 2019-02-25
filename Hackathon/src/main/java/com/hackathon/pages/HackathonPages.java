package com.hackathon.pages;

import org.openqa.selenium.Alert;

import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;

public class HackathonPages {
	
	public static void launchHackathon(String url) {
		getDriver().get(url);
	
	}
	public static void navigatetoRegisteredEmployees() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getDriver().findElement("btn.clickhere").click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public static void validateRegisteredEmployeePage() {
	if (getDriver().findElement("hdr.registered").isDisplayed()) {
	System.out.println("Employee Registartion page displayed successfully");
}
	else
	{System.out.println("Employee Registration page is not displayed successfully");}
}


public static void addEmployeeNavigation() {
	if (getDriver().findElement("btn.addEmployee").isDisplayed()) 
	{System.out.println("Add Employee link is displayed as expected and Employees can be added ");}
    else
	{System.out.println("Add Employee link is not displayed as expected and Employees cannot be added ");}
	
	getDriver().findElement("btn.addEmployee").click();
	
}


public static void employeeRegistration(String EmpID  , String Name, String Project, String PhoneNumber, String location) {
	getDriver().findElement("txt.EmpID").sendKeys(EmpID);
	getDriver().findElement("txt.Empname").sendKeys(Name);
	getDriver().findElement("txt.EmpProject").sendKeys(Project);
	getDriver().findElement("txt.phoneNo").sendKeys(PhoneNumber);
	getDriver().findElement("txt.location").sendKeys(location);
	getDriver().findElement("btn.Save").click();
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (getDriver().findElement("btn.addEmployee").isDisplayed()) 
	{System.out.println("Employee Registered Successfully");}
    else
	{System.out.println("Employee not Registered Successfully");}
	
}

public static void errorMessageValidation(String EmpID2  , String Name2, String Project2, String PhoneNumber2) {
	getDriver().findElement("txt.EmpID").sendKeys(EmpID2);
	getDriver().findElement("txt.Empname").sendKeys(Name2);
	getDriver().findElement("txt.EmpProject").sendKeys(Project2);
	getDriver().findElement("txt.phoneNo").sendKeys(PhoneNumber2);
	
	Alert alert = getDriver().switchTo().alert();
	System.out.println(alert.getText());
	String alerttext = alert.getText();
	String ExpectedAlertText= "Enter only Numbers"; 
	if (alerttext.equals(ExpectedAlertText) )
			{System.out.println("Error Message is displayed for Phone Number field");}
	else
	{System.out.println("Error Message is not displayed for Phone Number field");}	
}
	public static QAFExtendedWebDriver getDriver() {
		return new WebDriverTestBase().getDriver();
	}

}
