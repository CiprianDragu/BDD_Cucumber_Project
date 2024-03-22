Feature: User login

  Scenario: User can login to Magento application
    Given User navigate to Home page
    When User clicks sign in button
    And User inputs valid email and password
    Then Welcome message is displayed in home page

  Scenario: User can create a new account
    Given User navigate to Home page
    When User clicks Create an Account
    And User create new Account
    Then Welcome message its displayed

