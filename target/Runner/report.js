$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/login.feature");
formatter.feature({
  "name": "Employee Management Login Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to the Employee Management page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iNavigateToTheEmployeeManagementPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTheLoginPage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)\" because \"impl.LoginImpl.driver\" is null\r\n\tat impl.LoginImpl.validateLoginPage(LoginImpl.java:22)\r\n\tat steps.LoginSteps.iShouldSeeTheLoginPage(LoginSteps.java:18)\r\n\tat ✽.I should see the Login page(file:src/main/resources/features/login.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Validate the user can login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Positive1"
    }
  ]
});
formatter.step({
  "name": "I enter \"user\" in the \"Username\" input field",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter \"user123\" in the \"Password\" input field",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click \"Sign In\" button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see \"Welcome\" page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});