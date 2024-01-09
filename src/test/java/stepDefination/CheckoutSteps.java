package stepDefination;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.CheckoutPage;

public class CheckoutSteps {
	CheckoutPage check=new CheckoutPage();
	
	@When("enter firstname {string} lastname {string} and potsalcode {string}")
	public void enter_firstname_lastname_and_postalcode(String s1,String s2,String s3) {
		check.enter_firstname_lastname_and_postalcode(s1, s2, s3);
	}
	
	@When("click on continue button")
	public void click_on_continue_button() {
		check.click_on_continue_button();
		
	} 
	@When("click on finish button")
	public void	click_on_finish_button() {
		check.click_on_finish_button();
		
		
	}
	@Then("validate checkout text")
	public void validatetext() {
		
	}
	
}
