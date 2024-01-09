package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddProduct;

public class AddProductSteps {
	AddProduct add=new AddProduct();
	@When("click on add to cart")
	public void click_on_add_to_cart() {
	   add.click_on_add_to_cart();
	}
	@When("click on basket")
	public void click_on_basket() {
	  add.click_on_basket();
	}
	@When("Click on checkout")
	public void click_on_checkout() {
	    try {
			add.click_on_checkout();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("Validate text message")
	public void validate_text_message() {
	 add.validate_text_message();

}
}