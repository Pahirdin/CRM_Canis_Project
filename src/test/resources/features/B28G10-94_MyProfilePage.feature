Feature: CRM User menu functionality
  Agile story: As a user, I want to access my profile page

  @B28G10-136
  Scenario Outline: Access My Profile from User menu
    Given user is already logged in to CRM as "<userType>"
    When user clicks on user profile
    And user clicks on My Profile button
    Then user should be able to see General Drive Tasks Calendar Conversations
Examples:
    |userType|
    | helpDesk       |
    | humanResources |
    | marketing      |
