package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverFactory;

public class SearchHotelPage {
	
	WebDriver driver;
	
	public SearchHotelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy (xpath = "//span[contains(text(),'Search by Hotel or City Name')]")
	WebElement clickcity;
	
	@FindBy(xpath = "//div[@id='select2-drop']//input[@class='select2-input']")
	WebElement citytxt;
	
	@FindBy (xpath = "//ul[@class='select2-result-sub']/li[1]/div")
	WebElement CityName;
	
	@FindBy(xpath = "//div[@id='dpd1']//input[@placeholder='Check in']")
	WebElement checkintxt;
	
	@FindBy(xpath = "//input[@placeholder='Check out']")
	WebElement checkouttxt;
	
	@FindBy(xpath = "//input[@id='htravellersInput']")
	WebElement guesttxt;
	
	@FindBy (xpath = "//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")
	WebElement search;
	
	public void clickcity() {
		clickcity.click();
		
	}	
	
	public void inputCity(String city) {
		citytxt.sendKeys(city);
		CityName.click();
		
	}	
	
	public void inputCheckIn(String checkin) {
		checkintxt.sendKeys(checkin);
		
	}	
	
	public void inputCheckOut(String checkout) {
		checkouttxt.sendKeys(checkout);
		
	}	
	
	public void inputGuest(String guest) {
		guesttxt.sendKeys(guest);
		
	}	
	
	public void submit() {
		search.click();
		
	}	
	
//	public void closeBrowser() {
//		driver.close();
//		
//	}
}
