package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutPage extends Base {

	public void enter_firstname_lastname_and_postalcode(String x, String y, String z) {
		WebElement FN=driver.findElement(By.xpath("//input[@id='first-name']"));
		FN.sendKeys(x);
		WebElement LN=driver.findElement(By.xpath("//input[@id='last-name']"));
		LN.sendKeys(y);
		WebElement PC=driver.findElement(By.xpath("//input[@id='postal-code']"));
		PC.sendKeys(z);
		
		
		
	}

	public void click_on_continue_button() {
		WebElement con= driver.findElement(By.xpath("//input[@id='continue']"));
		clickOnElement(con);
	
		
	}
	
	public void	click_on_finish_button() {
		WebElement finishbtn=driver.findElement(By.xpath("//button[@id='finish']"));
		clickOnElement(finishbtn);
		
	}
	
	public void validatetext() {
		WebElement ele=driver.findElement(By.xpath("//span[@class='title']"));
		validateText(ele, "Checkout: Complete!");
		
	}

	

}
