@Funtional
Feature: Login to OrangeHRM portal

  As a registered user
  I want to log into the OrangeHRM portal
  So that I can access the system functionalities

  @ValidLogin
  Scenario: Login with valid credentials
    Given Mario is on the OrangeHRM login page
    When he enters username "Admin" and password "admin123"
    Then he should be redirected to the home page

  @InvalidLogin
  Scenario: Login with invalid credentials
    Given Mario is on the OrangeHRM login page
    When he enters username "Admin" and password "wrongPassword"
    Then he should see an error message indicating "Invalid credentials"