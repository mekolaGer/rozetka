package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Микола on 18.01.2016.
 */
public class Catalog {

    private WebDriver driver;

    private final By ourNotebook = By.cssSelector(".g-i-tile.g-i-tile-catalog");
    private final By demoVideoOurNote = By.cssSelector(".sprite.g-i-tile-review-l-i-link-video");


    public Catalog(WebDriver driver){
        this.driver = driver;
    }

    public Catalog SelectOnOurNotebook(){

        WebElement elOurNotebook = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(ourNotebook));

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(ourNotebook)).build().perform();

        return this;
    }

    public Catalog clickOnDemonstrationVideo(){

        WebElement demoVideoNotebook = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(demoVideoOurNote));
        driver.findElement(demoVideoOurNote).click();

        return this;
    }

}
