package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ResultsPage;
import utils.DriverManager;

public class ResultsPageSteps {
    ResultsPage resultsPageSteps = new ResultsPage(DriverManager.getDriver());

    @Then("should see Results on Result page")
    public void shouldSeeResultsOnResultPage() {
    }

}
