package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {

    ElementHelper elementHelper;

    By googleIcon = By.cssSelector(".lnXdpd");



    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }




}
