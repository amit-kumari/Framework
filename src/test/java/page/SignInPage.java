package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import helper.Base;



public class SignInPage extends Base {
	

	public void user_enter_username_and_password(String u,String p) {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(u);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(p);
	}

	
	public void user_click_on_login_button() {
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
	  clickOnElement(loginBtn);
	}

	
	public void validate_successful_login() {
		
	WebElement ele=driver.findElement(By.xpath("//div[@class='app_logo']"));
	validateText(ele,"Swag Labs");

}
}