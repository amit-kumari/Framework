package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckoutWithInvalidDetailsPage;

public class CheckoutWithInvalidDetailsSteps {
	
	
	CheckoutWithInvalidDetailsPage checkout=new CheckoutWithInvalidDetailsPage();
	
	@When("enter firstname {string} lastname {string}")
	public void enter_firstname_lastname(String s1,String s2 ) {
		checkout.enter_firstname_lastname(s1, s2);
	
	
	} 
	@Then("validate text message")
	public void validatetext() {

		
	}
	
	
	@When("enter firstname {string} postal code {string}")
	public void enter_firstname_postal_code(String p,String t) {
		checkout.enter_firstname_postal_code(p, t);
}
	@When("enter last name {string} postal code {string}")
	public void enter_lastname_postal_code(String m,String n) {
		checkout.enter_lastname_postal_code(m,n);
	}
	
	
}