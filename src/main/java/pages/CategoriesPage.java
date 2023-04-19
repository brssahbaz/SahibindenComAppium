package pages;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CategoriesPage {

    ElementHelper elementHelper;

    By googleIcon = By.cssSelector(".lnXdpd");



    public CategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }



    @When("taps {string} on Category page")
    public void tapsOnCategoryPage(String arg0) {
    }




}
