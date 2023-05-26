package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPhone {
	
	@FindBy(id = "buy-now-button")
	private WebElement buyPhone;
	
	public BuyPhone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickBuyNowBtn() {
		buyPhone.click();
	}

}
