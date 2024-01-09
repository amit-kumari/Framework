package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SignInPage;

public class LoginPageSteps {
	SignInPage login=new SignInPage();
	
	

@When ("user enter username {string} and password {string}")
public void user_enter_username_and_password(String string, String string2) {
    login.user_enter_username_and_password(string, string2);
}

	@When("user click on login button")
	public void user_click_on_login_button() {
	  login.user_click_on_login_button();
	}

	@Then("validate successful login")
	public void validate_successful_login() {
	
	}


}
