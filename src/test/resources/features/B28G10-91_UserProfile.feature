@B28G10-114
Feature: User Profile Functionality
  B28G10-91
  US : As a user, I should be able to see all the options under the user profile.

  Scenario Outline: Verify Five options should be displayed under the user profile
    Given user is on CRM home page as "<username>"
    When user clicks on user profile icon
    Then five options should be displayed under the user profile
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |
    Examples:
      | username       |
      | helpDesk       |
      | humanResources |
      | marketing      |
