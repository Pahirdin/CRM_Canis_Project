Feature: Appreciation Functionality
  User Story :As a user, I should be able to make an Appreciation using the Appreciation tab

  Scenario: Verify Users should be able to write messages in and send Appreciation by clicking the SEND button
    Given user is on CRM home page as "<username>"
    When user clicks on "MORE" at the top menu
    And user clicks on "Appreciation"
    And user write messages