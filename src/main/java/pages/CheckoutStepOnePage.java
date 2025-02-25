package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOnePage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id='first-name']") // Replace with actual ID
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last-name']") // Replace with actual ID
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='postal-code']") // Replace with actual ID
    private WebElement zipCodeField;

    @FindBy(xpath = "//input[@id='continue']") // Replace with actual locator
    private WebElement continueButton;

    ////
    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterZipCode(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }

    public void clickContinue() {
        continueButton.click();
    }

}
