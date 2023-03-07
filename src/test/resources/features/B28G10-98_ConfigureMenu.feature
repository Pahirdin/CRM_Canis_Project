Feature: Verify configure menu.

  @configureMenu
  Scenario: User can see the options in Configure Menu
    Given user is already logged in to CRM as "humanResources"
    When user click configure menu
    Then user sees below options
     # 'Configure Menu Items''Collapse menu''Remove current page from left menu''Add custom menu item''Change primary tool'''Reset menu
