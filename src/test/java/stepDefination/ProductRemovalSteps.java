package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductRemovalPage;

public class ProductRemovalSteps {
	ProductRemovalPage remove=new ProductRemovalPage();
	@When("click on remove button")
	public void click_on_remove_button() {
		remove.click_on_remove_button();
	}
	@Then("validate count on basket")
	public void validate_count_on_basket()  {
		remove.validate_basket_count(null);
	}

}
