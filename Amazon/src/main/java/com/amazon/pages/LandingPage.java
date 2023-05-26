package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	Actions actions;
	
	//driver.findElement(By.linkText("Mobile")).click();
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement helloSignInMenu;
	
	@FindBy(linkText = "Sign in")
	private WebElement helloSignIn;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 actions = new Actions(driver);
	}
	
	public void clickMobile() {
		mobiles.click();
	}
	
	public void hoverPointerOverHelloSignInMenu() {
		actions.moveToElement(helloSignInMenu).build().perform();
		
	}
	public void clickSignIn() {
		helloSignIn.click();
	}

}
