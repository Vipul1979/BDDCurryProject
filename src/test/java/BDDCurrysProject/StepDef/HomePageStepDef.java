package BDDCurrysProject.StepDef;

import BDDCurrysProject.PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {
    HomePage homePage = new HomePage();
    @Given("^user is on curry website$")
    public void user_is_on_curry_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user search laptop$")
    public void user_search_laptop() throws Throwable {
    homePage.seachbox();

    }

    @Then("^user click on seach button$")
    public void userClickOnSeachButton() {
        homePage.searchbuttonclick();
    }
}
