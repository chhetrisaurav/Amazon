package com.amazon.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;

public class VerifyErrMsgTest extends BaseTest{
	
		
		@Test
		public void verifyErrorMsg() {
			//4) Hover pointer over 'Hello Sign in' menu
			LandingPage landingPage = new LandingPage(driver);
			landingPage.hoverPointerOverHelloSignInMenu();
			
			//5) Click on 'Sign in' button in the sub-menu
			landingPage.clickSignIn();
			
			//6) enter an invalid email id in email textbox on sign in page
			SignIn signIn = new SignIn(driver);
			signIn.enterEmail("batman554466@gmail.com");
			
			//7) Click on 'Continue' button
			signIn.clickContinueBtn();
			//8) Verify the error message - "We cannot find an account with that email address" is displayed
			String expectedErrMsg = "We cannot find an account with that email address";
			String actualErrMsg = signIn.getErrMsg();
			
			Assert.assertEquals(actualErrMsg, expectedErrMsg);
		}
		

	
}
