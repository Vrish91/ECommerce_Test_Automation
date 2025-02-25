package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(id = "search-box")
    private WebElement searchBox;

    @FindBy(id = "search-button")
    private WebElement searchButton;

    @FindBy(css = ".product-title")
    private WebElement productTitle;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);
        searchButton.click();
    }

    public String getFirstProductTitle() {
        return productTitle.getText();
    }
}