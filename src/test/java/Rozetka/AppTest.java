package Rozetka;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {

    private FirefoxDriver driver;
    private HomePage homePage;
    private Panel panel;
    private Catalog catalog;
    private ElementPage elementPage;


    @Before
    public void precondition() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        panel = new Panel(driver);
        catalog = new Catalog(driver);
        elementPage = new ElementPage(driver);
    }


    @org.junit.Test
    public void TestBuyNotebookLenova() throws InterruptedException {

        homePage.openHomePage();
        panel.OpenElementOnPanel();
        catalog.SelectOnOurNotebook().
                clickOnDemonstrationVideo();
        Assert.assertTrue(elementPage.TextFound());

    }


    @After
    public void postcondition(){
        driver.quit();
    }


}
