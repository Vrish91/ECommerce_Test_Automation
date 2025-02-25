package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(id = "add-to-cart")
    private WebElement addToCartButton;

    @FindBy(id = "cart-icon")
    private WebElement cartIcon;

    @FindBy(id = "checkout-button")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void openCart() {
        cartIcon.click();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}