
#// Verify the users view all modules in the Drive page.
#//My Drive
#//All Documents
#//Company Drive
#//Sales and Marketing
#//Top Management's documents
#//Drive Cleanup



#// As a user, I want to access the Drive page.

Feature: Drive Page.
  Agile US: As a user I want to access Drive page.

Scenario Outline: Verify the users view all six modules in the Drive page.


Given user is already logged in to CRM as following "<userType>".
     When user clicks on Drive module button
     Then user should go Drive page
     Then user should see all six modules in Drive page

Examples:
| userType       |
| helpDesk       |
| humanResources |
| marketing      |


