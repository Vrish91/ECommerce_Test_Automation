package tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import pages.AddToCartPage;
import pages.CheckoutStepOnePage;
import pages.CheckoutStepTwoPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void testCheckoutProcess() {
    	
    	  String username = ConfigReader.getProperty("username");
          String password = ConfigReader.getProperty("password");
          
          
        // Step 1: Perform login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        // Step 2: Add an item to the cart
        AddToCartPage cartPage = new AddToCartPage(driver);
        cartPage.addItemToCart();
        cartPage.goToCart();
        cartPage.clickCheckout();
        
        
        
        // Step 3: Checkout Step 1 - Enter user details
        CheckoutStepOnePage checkoutStepOne = new CheckoutStepOnePage(driver);
        checkoutStepOne.enterFirstName("John");
        checkoutStepOne.enterLastName("Doe");
        checkoutStepOne.enterZipCode("12345");
        checkoutStepOne.clickContinue();

        // Step 4: Checkout Step 2 - Finish order
        CheckoutStepTwoPage checkoutStepTwo = new CheckoutStepTwoPage(driver);
        checkoutStepTwo.clickFinish();

        // Step 5: Validate if order is placed
        boolean orderPlaced = checkoutStepTwo.isOrderPlaced();
        Assert.assertTrue(orderPlaced, "Order was not placed successfully!");

        System.out.println("Test Passed: Checkout completed successfully.");
    }
}