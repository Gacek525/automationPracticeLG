package pl.b2b.net.automationPractice.pages.womenPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectWomenPage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectWomenPage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = DataWomenPage.TOPS_IMAGE)
    private WebElement topsImage;

    public void cickTops() {
        wait.until(ExpectedConditions.elementToBeClickable(topsImage));
        topsImage.click();
    }
}
