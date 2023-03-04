@ConfigureMenu
Feature: Verify users can access to 6 options under the CONFIGURE MENU.

  Scenario Outline: Verify CONFIGURE MENU options.
    Given user is already logged in to CRM as <"userType">
    Examples:
    |userType|
    |helpDesk|
    |humanResources|
    |marketing|

    When user click configure menu
    Then user can access below 6 options
      | Configure Menu Items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
