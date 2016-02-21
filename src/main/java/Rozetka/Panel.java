package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.*;

public class Panel {

    private WebDriver driver;

    private final By ComputersNotebooks = By.cssSelector(".m-main [href=\"http://rozetka.com.ua/computers-notebooks/c80253/\"]");
    private final By Notebooks = By.cssSelector(".m-main [href=\"http://rozetka.com.ua/notebooks/c80004/\"]");
    private final By Notebook = By.cssSelector(".m-main [href=\"http://rozetka.com.ua/notebooks/c80004/filter/\"]");

    public Panel(WebDriver driver) {
        this.driver = driver;
    }

    public Panel OpenElementOnPanel() {


        Actions builder = new Actions(driver);

        WaitOuerElement(ComputersNotebooks, builder, false);
        WaitOuerElement(Notebooks, builder, false);
        WaitOuerElement(Notebook, builder, true);

        return this;
    }



    public void WaitOuerElement(By ourElement, Actions builder, boolean clickOn){

        WebElement myDynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(ourElement));

        if (clickOn) {
            builder.moveToElement(driver.findElement(ourElement)).click().build().perform();
        }
        else{
            builder.moveToElement(driver.findElement(ourElement)).build().perform();
        }

    }

}
