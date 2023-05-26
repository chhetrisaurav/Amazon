package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllMobiles {
	Actions action;
	
	@FindBy(linkText = "Mobiles & Accessories")
	private WebElement mobileAndAccessories;
	
	@FindBy(linkText = "Apple")
	private WebElement apple;
	
	public AllMobiles(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void hoverOverMobileAndAccessories(){
		action.moveToElement(mobileAndAccessories).build().perform();
			
	}
	public void clickApple() {
		apple.click();
	}

}
