package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

    WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack") // Update based on your website
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']") // Update locator for the cart link
    private WebElement cartLink;

    @FindBy(xpath = "//div[@class='inventory_item_name']") // Update locator for cart item verification
    private WebElement cartItem;
  
    @FindBy(id = "checkout")  // Confirm ID in Inspect Element
    private WebElement checkoutButton;

    public void clickCheckout() {
        checkoutButton.click();
    }

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart() {
        addToCartButton.click();
    }

    public void goToCart() {
        cartLink.click();
    }

    public boolean isItemInCart() {
        return cartItem.isDisplayed();  // Checks if item is present in the cart
    }
}