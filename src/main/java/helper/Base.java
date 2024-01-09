package helper;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {
public static	Properties prop;
	public static WebDriver driver;
	static {
		
		
		
		try {
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resource/envt.properties");
			prop= new Properties();
			prop.load(file);
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
			
		
	}
	
	@Before
	public void setup() {
		
		String BrowserName = prop.getProperty("browser");
		
		
	    if(BrowserName.equals("chrome")) {
			driver=new ChromeDriver();
		
		}else if(BrowserName.equals("firefox")){
			driver=new FirefoxDriver();
		}else if(BrowserName.equals("egde")){
			driver=new EdgeDriver();
		}//or switch(BrowserName){
	    //case "chrome":
	    //chromeoptions option=new chromeoptions();to open chrome in incognito mode
	   // option.addArguments(""--incognito");
	    //driver=new chromeDriver(option);
	  // break;
	  //case "chrome":
	    //driver=new chromeDriver();
	   // break;
	    //case "firefox":
	    //driver=new firefoxDriver();
	    //break;
	    //case "edge":
	    //driver=new edgeDriver();
	    //break;
	//}
		
		 
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		
	}
	
	public void selectDropdown(WebElement ele,String value ,String type) {
		
		Select s=new Select(ele);
		switch (type) {
		case "visibleText":
			s.selectByVisibleText(value);
			break;

		case "index":
			s.selectByIndex(Integer.parseInt(value));//convert string value into integer
			break;
		case "value":
			s.selectByValue(value);
			break;
		}
	
	}
	
	public void actionMethods(WebElement ele,String methodType) {
		Actions a=new Actions(driver);
		switch(methodType){
		case"mousehover":
		a.moveToElement(ele).build().perform();
		break;
		case"click":
			a.click(ele).build().perform();
			break;
		case"doubleclick":
		a.doubleClick(ele).build().perform();
		break;
		case "contextclick":
			a.contextClick(ele).build().perform();
			break;
		case"dragAndDrop":
			a.dragAndDrop(ele,ele).build().perform();
			break;
		case"sendkeys":
			a.sendKeys(Keys.ENTER).build().perform();
			break;
		}
	
		
	}
	public void bootStrapDropDown(List<WebElement>list,String value) {
		for(WebElement ele:list) {
			
		String eletext=	ele.getText();
		if(eletext.equals(value));
		ele.click();
		break;
		}
		
		
	}
	public void explicitWait(WebElement ele,String condition) {
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		switch(condition) {
		case"clickable":
			w.until(ExpectedConditions.elementToBeClickable(ele));
			break;
		case"visibility":
		w.until(ExpectedConditions.visibilityOf(ele));
		break;
		
		case"alert":
			w.until(ExpectedConditions.alertIsPresent());
			break;
		case"invisibility":
			w.until(ExpectedConditions.invisibilityOf(ele));
			break;
		
		
		}
		
	}
	public void handleAlert(String type) {
		Alert a= driver.switchTo().alert();
		switch(type) {
		case"select":
			a.accept();
			break;
		case"cancel":
			a.dismiss();
			break;
			
		
		}
	}
	public void waitForElement(int timeout,String condition,WebElement ele) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		switch(condition) {
		case"alert":
			wait.until(ExpectedConditions.alertIsPresent());
			break;
		case"clickable":
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			break;
		
		
		}
	}

	public void validateText(WebElement ele,String expected)
	{
		
		waitForElement(10, "visible", ele);
		String actualValue= ele.getText();
		assertEquals(actualValue, expected);

		
	}
	
	public void clickOnElement(WebElement ele)
	{
		
		waitForElement(10, "visible", ele);
		try {
			ele.click();
		} catch (Exception e) {
			// TODO: handle exception
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click", ele);
		}
		
	}
	@After
	public void tearDown(Scenario s) throws IOException{
		if(s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("Screenshots/"+s.getName()+".png"));
			
		}
		
		driver.quit();	
			
	}
	
	public void switchwindow(String title) {
		
		
		Set<String> allWindow = driver.getWindowHandles();
		for (String s:allWindow) {
			driver.switchTo().window(s);
			String currentTitle=driver.getTitle();
			if(currentTitle.equals(title)) {
			break;
			}
		}
		
	}
	
}
