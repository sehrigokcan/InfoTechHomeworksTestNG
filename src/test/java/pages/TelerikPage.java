package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikPage {
    public TelerikPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="onetrust-accept-btn-handler")
    public WebElement acceptAndCloseButton;

    @FindBy (xpath="//*[@id='js-tlrk-nav-drawer-button']")
    public WebElement ustbarButton;

    @FindBy (id="js-tlrk-nav-search-link")
    public WebElement searchButtonBar;

    @FindBy (xpath = "//*[@type='search']")
    public WebElement searchBox;

    @FindBy (className = "TK-Tag-Input-Button")
    public WebElement searchButton;

    @FindBy (xpath = "//*[@id='js-results-wrapper']/div[1]/div")
    public WebElement ilkAramaSonucu;


}
