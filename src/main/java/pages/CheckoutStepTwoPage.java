package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepTwoPage {
    WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Finish')]") // Update if needed
    private WebElement finishButton;

    @FindBy(xpath = "//*[contains(text(), 'Thank you for your order!')]") // Replace with actual order confirmation locator
    private WebElement orderConfirmationMessage;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFinish() {
        finishButton.click();
    }

    public boolean isOrderPlaced() {
        return orderConfirmationMessage.isDisplayed();
    }
}