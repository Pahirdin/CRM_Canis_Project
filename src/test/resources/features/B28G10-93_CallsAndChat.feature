Feature: Chat and Calls Module Access
  AGILE STORY: As a user, I should be able to access the Chat and Calls module.

     @B28G10-138
     Scenario Outline: Accessing the Chat Module
     Given user is already logged in to CRM as following "<userType>".
     When User navigate to the Chat and Calls module
     Then User should see a list of my submodules

  Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |