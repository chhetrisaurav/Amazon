package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleMobiles {
	@FindBy(xpath ="(//div[contains(@class,'sg-col-inner')])[5]")
	private WebElement clickSecPhone;
	
	public AppleMobiles(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSecPhone() {
		clickSecPhone.click();
	}

}
