package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());




    @Given("User should see the Home page")
    public void userShouldSeeTheHomePage() {
       homePage.checkLoginLogo();


    }

    @When("taps {string} on Home page")
    public void tapsOnHomePage(String tab) {
        homePage.clickTab(tab);

    }




}
