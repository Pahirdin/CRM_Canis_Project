
Feature: The Company Page Functionality
  US:As a user, I should be able to access to the Company page .
  @B28G10-145
  Scenario: Verify users see the 7 modules in the Company page shown as design
    Given user is already logged in to CRM
    When user clicks on the Company page
    Then users see the seven modules in the Company page shown as design

    |Official Information|
    |Our Life            |
    |About Company       |
    |Photo Gallery       |
    |Video               |
    |Business News (RSS) |
    |Career              |

