package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefs {

    @Given("the user logged in as {string}")
    public void theUserLoggedInAs(String userType) {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }

    @And("the title contains {string}")
    public void the_title_contains(String expectedTitle) {


        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));


    }

    }


