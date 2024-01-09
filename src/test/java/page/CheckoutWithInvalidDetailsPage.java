package page;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;


public class CheckoutWithInvalidDetailsPage extends Base{
	



	public void enter_firstname_lastname(String x, String y) {
	WebElement FN=driver.findElement(By.xpath("//input[@id='first-name']"));
	FN.sendKeys(x);
	WebElement LN=driver.findElement(By.xpath("//input[@id='last-name']"));
	LN.sendKeys(y);
}
	
	

	public void click_on_continue_button() {
		WebElement conbtn=driver.findElement(By.xpath("//input[@id='continue']"));
		clickOnElement(conbtn);
	
		
	}
 
    public void validatetext() {
    	WebElement ele= driver.findElement(By.xpath("//h3[@data-test='error']"));
	validateText(ele,"Error: Last Name is required");
}



	public void enter_lastname_postal_code(String m, String n) {
		WebElement LN=driver.findElement(By.xpath("//input[@id='last-name']"));
		LN.sendKeys(m);
		WebElement PC=driver.findElement(By.xpath("//input[@id='postal-code']"));
		PC.sendKeys(n);
	}



	public void enter_firstname_postal_code(String p, String t) {
		WebElement FN=driver.findElement(By.xpath("//input[@id='first-name']"));
		FN.sendKeys(p);
		WebElement PC=driver.findElement(By.xpath("//input[@id='postal-code']"));
		PC.sendKeys(t);
	}

	
	
		
	
}