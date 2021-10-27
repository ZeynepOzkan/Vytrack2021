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




    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {

        String username=ConfigurationReader.get("driver_username");
        String password=ConfigurationReader.get("driver_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);

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

        //yeni ekleme

    }









