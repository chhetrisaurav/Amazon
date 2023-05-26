package com.amazon.testscripts;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.pages.AllMobiles;
import com.amazon.pages.AppleMobiles;
import com.amazon.pages.BuyPhone;
import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;

public class BuyMobilePhoneTest extends BaseTest{
	
	@Test
	public void buyMobilePhone() {
	//	4) click on 'Mobiles'
		LandingPage landingPage = new LandingPage(driver); //class object = new class();
		landingPage.clickMobile();  //object.method();
		
	//	5) Hover over 'Mobiles & Accessories' on the 2nd page
		AllMobiles allMobiles = new AllMobiles(driver);
		allMobiles.hoverOverMobileAndAccessories();
		
	//	6) Click on 'Apple' in the sub-menu on the 2nd page
		allMobiles.clickApple();
		
	//	7) Click on second available phone on 3rd page
		AppleMobiles applemobiles = new AppleMobiles(driver);
		applemobiles.clickSecPhone();
		
	//	8) Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
	//	9) Click on 'Buy now' button on 4th page
		BuyPhone buyphone = new BuyPhone(driver);
		buyphone.ClickBuyNowBtn();
		
	//	10) Verify user is on the Sign-in page on 5th page
		SignIn signIn = new SignIn(driver);
		String expectedTxt = "Sign in";
		String actualTxt = signIn.getSignInText();
		
		Assert.assertEquals(actualTxt, expectedTxt);
	
	}
}
