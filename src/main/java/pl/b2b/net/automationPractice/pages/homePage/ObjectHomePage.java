package pl.b2b.net.automationPractice.pages.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ObjectHomePage {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public ObjectHomePage(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.wait = wait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = DataHomePage.WOMEN_PAGE)
    private WebElement womenPage;

    public void clickWomenPage() {
        wait.until(ExpectedConditions.elementToBeClickable(womenPage));
        womenPage.click();
    }

    @FindAll(@FindBy (xpath = DataHomePage.CATEGORIES))
    private List<WebElement> categoriesList;

    public void clickCategories (String name) {
        wait.until(ExpectedConditions.elementToBeClickable(categoriesList.get(0)));

        for (WebElement webElement : categoriesList) {
            if (webElement.getAttribute("title").equals(name)){
                webElement.click();
                break;
            }
        }
    }
}
