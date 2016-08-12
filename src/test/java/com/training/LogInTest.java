package com.training;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LogInTest {
	
	@Test(groups = {"Smoke","Regression"} )
	public void testMethod1(){		
		System.out.println("Test MEthod 1");		
	}
	
	@Test(groups = {"Regression"} )
	public void testMethod2(){
		System.out.println("Test MEthod 2");
		
	}
	
	@Given("^User goes to home page$")
	public void user_goes_to_home_page() throws Throwable {
		System.out.println("Given Code Block");
	    
	}

	@When("^user logs in using invlaid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logs_in_using_invlaid_username_and_password(String arg1, String
	 arg2) throws Throwable {
		System.out.println("When Code Block");
	    
	}

	@Then("^user should be stayed on the same loginpage and display error$")
	public void user_should_be_stayed_on_the_same_loginpage_and_display_error() throws Throwable {
		System.out.println("Then Code Block");
	    
	}

}
		