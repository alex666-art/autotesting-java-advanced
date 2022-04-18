package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;
    public HeaderPanel headerPanel;

    private String url = "http://intershop6.skillbox.ru/";

    @FindBy(css = "#accesspress_storemo-2 .caption")
    public WebElement bookCardLocator;
    @FindBy(css = "h1.entry-title.ak-container")
    public WebElement sectionBookTitleLocator;
    @FindBy(css = "#accesspress_storemo-3 .caption")
    public WebElement tabletCardLocator;
    @FindBy(css = "#accesspress_storemo-4 .caption")
    public WebElement cameraCardLocator;
    @FindBy(css = ".promo-widget-wrap-full .btn.promo-link-btn")
    public WebElement seeProductButtonLocator;
    @FindBy(css = ".product_title.entry-title")
    public WebElement tabletTitleHeaderLocator;

    public By viewedProductsModuleLocator = By.cssSelector("#woocommerce_recently_viewed_products-2");
    public By phoneTextLocator = By.cssSelector(".text-5-value:nth-child(1)");
    public By htmlLocator = By.cssSelector("html");
    public By emailTextLocator = By.cssSelector(".text-5-value:nth-child(2)");

    public MainPage(WebDriver driver) {
        this.driver = driver;
        headerPanel = new HeaderPanel(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.navigate().to(url);
    }

    public String get__title() {
        return sectionBookTitleLocator.getText();
    }

    public String get__phone__sub__title() {
        return driver.findElement(phoneTextLocator).getText();
    }

    public String get__email__sub__title() {
        return driver.findElement(emailTextLocator).getText();
    }
}