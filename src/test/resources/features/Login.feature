Feature: Login functionality
  Agile story: As a user, I should be able to log in to the CRM.

  Scenario: Login function verification
    Given user is on the login page
    When user enters username and password
    And user click to login button
    Then user should go to homepage

