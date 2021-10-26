package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

    }


    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {

        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);

    }



    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }
        @When("the user enter the store manager information")
        public void the_user_enter_the_store_manager_information() {


        String username=ConfigurationReader.get("store_manager_username");
        String password=ConfigurationReader.get("store_manager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);

        }

    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        String username=ConfigurationReader.get("sales_manager_username");
        String password=ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }





    @Given("login with different {string}")
    public void loginWithDifferent(String userType) {

        //go to login page
       Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equals("driver")){
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        }else if(userType.equals("sales manager")){
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        }else if(userType.equals("store manager")){
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);

    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {



        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {


        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

        //yeni ekleme

    }
}


