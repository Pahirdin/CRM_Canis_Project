
Feature: Time and Reports page
  Agile story: As a user, I want to access the Time and Reports page.


  @timeAndReport
  Scenario: Verify the users view all modules in the Time and Reports page.
    Given user is already logged in to CRM as "helpDesk"
    When user clicks on Time and Reports module
    Then user should go Time and Reports page
    Then user should see all modules in Time and Reports page