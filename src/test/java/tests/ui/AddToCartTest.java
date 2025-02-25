package tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.LoginPage;
import utils.ConfigReader;

public class AddToCartTest extends BaseTest {
	
    @Test
    public void testAddToCartAfterLogin() {
    	
    	// Fetch login details from config file
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        
    	//Login First
    	  LoginPage loginPage = new LoginPage(driver);
          loginPage.enterUsername(username);
          loginPage.enterPassword(password);
          loginPage.clickLogin();    	
    	
          //Proceed to Add Items to cart
    	AddToCartPage cartPage = new AddToCartPage(driver);
        
        cartPage.addItemToCart(); // Add item
        cartPage.goToCart(); // Navigate to cart
        
        // Validate if item is added to the cart
        boolean itemAdded = cartPage.isItemInCart();
        Assert.assertTrue(itemAdded, "Item was not added to the cart!");
        
        System.out.println("Test Passed: Item successfully added to cart.");
    }
}