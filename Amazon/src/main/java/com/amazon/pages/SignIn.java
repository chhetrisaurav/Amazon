package com.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {
	WebDriverWait wait; //using wait
	
	@FindBy(xpath = "//h1[contains(@class,'a-spacing-small')]")
	private WebElement signInBtn;
	
	@FindBy(id = "ap_email")
	private WebElement emailTxtBox;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//span[contains(@class,'a-list-item')]")
	private WebElement errorMsg;
		
	
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60)); //using wait
	}
	
	public String getSignInText() {
		
		wait.until(ExpectedConditions.visibilityOf(signInBtn));//using wait
		
		String text = signInBtn.getText();	
		return text;	
	}	
	
	public void enterEmail(String email) {
		emailTxtBox.sendKeys(email);
	}
	public void clickContinueBtn() {
		continueBtn.click();
	}
	public String getErrMsg() {
		String text = errorMsg.getText();
				return text;
		
	}
	

}
