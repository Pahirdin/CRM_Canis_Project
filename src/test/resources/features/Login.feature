Feature: Login functionality
  Agile story: As a user, I should be able to log in to the CRM.

  Scenario: Login function verification
    Given user is on the login page
    When user login as "humanResources"
    Then user should go to homepage


  Scenario: Pre-Condition
    Given user is already logged in to CRM as "userType"
                                             #  ↑↑↑↑↑    change the userType to specific userType
                                             # userType:  helpDesk   humanResources   marketing


  Scenario Outline: Negative login scenario
    Given user is on the login page
    When user enter "<wrongUsername>" or "<wrongPassword>"
    Then display “Incorrect username or password”

    Examples:
      | wrongUsername                 | wrongPassword |
      | helpdesk1@cybertekschool.com  | 123456        |
      | hr1@cybertekschool.com        | home123       |
      | marketing1@cybertekschool.com | 112233asd     |
      | abc123@gmail.com              | UserUser      |
      | wrong@hotmail.com             | UserUser      |
      | pass_this_test@hotmail.com    | PassMe5678    |



