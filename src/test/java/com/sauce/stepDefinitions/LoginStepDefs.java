package com.sauce.stepDefinitions;

import com.sauce.pages.EmployeeListPage;
import com.sauce.pages.LoginPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    EmployeeListPage employeeListPage = new EmployeeListPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("The user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {

        loginPage.login(username, password);

    }

    @When("The user navigates {string}")
    public void the_user_navigates(String StepName) {
        employeeListPage.employeeList.click();

    }

    @When("The user creates a new employee")
    public void the_user_creates_a_new_employee() {
        employeeListPage.newEmployee();

    }

    @When("The user verify {string} is in the list")
    public void the_user_verify_is_in_the_list(String name) {
        employeeListPage.verifyNew(name);

    }

    @When("The user deletes  {string} from list")
    public void the_user_deletes_from_list(String name) {

        employeeListPage.deleteNew(name);

    }

    @Then("The user verify {string} isn`t in the list")
    public void the_user_verify_isn_t_in_the_list(String name) {

        employeeListPage.confirmDelete(name);


    }
}
