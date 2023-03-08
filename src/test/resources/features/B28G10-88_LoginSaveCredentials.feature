Feature: CRM Login feature verification
  Agile story: As a user, I should be able to save my user credential on a computer

  @Nick
  Scenario Outline: User can save credentials on Log in page
    Given user is on the login page
    When user log in as "<userType>"
    And clicks on Remember me checkbox
    Then user should be able to save credentials
    And user click SignIn button
    Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |