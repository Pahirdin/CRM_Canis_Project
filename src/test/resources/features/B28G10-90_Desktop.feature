@desktop
Feature: homepage functionality
  Agile story: As user i should see desktop options to download on the homepage.

  Scenario Outline: Verify there should be 3 options for the desktop version
    Given User is on CRM home page as "<username>"
    When user scroll down to see the desktop client options
    Then user should  be able to see three options for the desktop version
    |MAC OS |
    |WINDOWS|
    |LINUX  |
    Examples:
      | username       |
      | helpDesk       |
      | humanResources |
      | marketing      |