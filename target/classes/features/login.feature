Feature: Employee Management Login Page

  Background:
    Given I navigate to the Employee Management page
    Then I should see the Login page

    @Positive1
    Scenario: Validate the user can login with valid credentials
      Then I enter "user" in the "Username" input field
      Then I enter "user123" in the "Password" input field
      Then I click "Sign In" button
      And I should see "Welcome" page

    Scenario: Validate the admin can log in with valid credentials
      Then I enter "admin" in the "Username" input field
      Then I enter "admin123" in the "Password" field
      Then I click "Sign in" button
      And I should see the "Welcome" page