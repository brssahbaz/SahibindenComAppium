package pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultsPage {

    ElementHelper elementHelper;

    By googleIcon = By.cssSelector(".lnXdpd");



    public ResultsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }




}
