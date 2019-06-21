package com.spartaglobal.cucumberexample.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberInv {
    @Given("cucumber is set up correctly")
    public void cucumber_is_set_up_correctly(){
        //write code here that turns the phrase above into actions
        System.out.println("aa");
    }

    @When("I run the test")
    public void I_run_the_test(){
        System.out.println("aa");
    }

    @Then("I can see them run")
    public void I_can_see_them_run(){
        System.out.println(" a");
    }

    @Given("input correct details until the password field")
    public void input_correct_details_until_the_password_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I input a passoword that is too short {string}")
    public void i_input_a_passoword_that_is_too_short(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I receive the error message")
    public void i_receive_the_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
