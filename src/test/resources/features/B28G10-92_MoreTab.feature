Feature: More tab Access
  AGILE STORY: As a user I should be able to access the More module

  @B28G10-116 @wip
  Scenario Outline: Accessing the More module

    Given user is already logged in to CRM as following "<userType>".
    When user clicks on more tab
    Then four options should be displayed under the more tab
     Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |
