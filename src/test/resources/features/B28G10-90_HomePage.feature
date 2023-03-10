Feature: homepage functionality
  Agile story: As user i should see desktop options to download on the homepage.



  @B28G10-145
  Scenario Outline: Pre-Condition
    Given user is already logged in to CRM as following "<userType>".
    When user scroll down to see the desktop client options
    Then user should  be able to see three options for the desktop version
      | MAC OS  |
      | WINDOWS |
      | LINUX   |
    Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |
