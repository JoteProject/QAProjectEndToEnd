package steps;

import impl.LoginImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
    @Given("I navigate to the Employee Management page")
    public void iNavigateToTheEmployeeManagementPage() {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.navigateToPage();

    }

    @Then("I should see the Login page")
    public void iShouldSeeTheLoginPage() {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.validateLoginPage();
    }
}
