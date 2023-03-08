Feature:
  User Story: As a user, I should be able to log out from the CRM app.
@wip2


  Scenario Outline: Pre-Condition
    Given user is already logged in to CRM as following "<userType>".
    Then user clicks on username tab
    And user clicks on logout
    Then user is on the login page verification
    Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |


