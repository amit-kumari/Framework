package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class ProductRemovalPage extends Base{

	public void click_on_remove_button() {
		WebElement removebtn=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		clickOnElement(removebtn);
		
		
	}
	public void validate_basket_count(WebElement ele1) {
		WebElement ele=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		validate_basket_count(ele);
		
	}
	
	
}
