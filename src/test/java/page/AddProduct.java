package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class AddProduct extends Base{
	
	
	public void click_on_add_to_cart() {
		WebElement addcartbtn =driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	  clickOnElement(addcartbtn);
	}
	 
	
	public void click_on_basket() {
		
	WebElement basketbtn=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
	   clickOnElement(basketbtn);
	}

	public void click_on_checkout() throws InterruptedException 
	{
		WebElement checkout =driver.findElement(By.xpath("//button[@id='checkout']"));
	
	    clickOnElement(checkout);
	    Thread.sleep(1000);
	}
	
	public void validate_text_message() {
	WebElement ele=driver.findElement(By.xpath("//span[@class='title']"));
validateText(ele, "Checkout: Your Information");

}
}