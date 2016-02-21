package Rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ElementPage {

    private WebDriver driver;

    private final By textElement = By.cssSelector(".detail-video-title.detail-video-social-title");

    public ElementPage(WebDriver driver){
        this.driver = driver;
    }

    public  boolean TextFound(){

        return driver.findElement(textElement).isDisplayed();

    }

}
