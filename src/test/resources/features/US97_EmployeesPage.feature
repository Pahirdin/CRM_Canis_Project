@ahmad
Feature: Access the Employees page.

  Agile Story: As a user, I want to access the Employees page.


  Scenario: Employees page modules verification
    Given User is already in ctisSolution page
    When User click the employee page
    Then User see all below modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |