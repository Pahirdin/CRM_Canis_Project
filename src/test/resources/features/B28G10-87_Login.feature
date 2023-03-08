Feature: Login functionality
  Agile story: As a user, I should be able to log in to the CRM.

  @B28G10-140
  Scenario Outline: Login function verification
    Given user is on the login page
    When user login as "<userType>"
    Then user should go to homepage
    Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |

  @B28G10-141
  Scenario Outline: Negative login scenario
    Given user is on the login page
    When user enter "<wrongUsername>" or "<wrongPassword>"
    Then display “Incorrect username or password”

    Examples:
      | wrongUsername                 | wrongPassword |
      | helpdesk1@cybertekschool.com  | 123456        |
      | hr1@cybertekschool.com        | home123       |
      | marketing1@cybertekschool.com | 112233asd     |
      | abc123@gmail.com              | UserUser      |
      | wrong@hotmail.com             | UserUser      |
      | pass_this_test@hotmail.com    | PassMe5678    |



  #----------------------------------------------------
    # for other members ↓↓↓↓↓↓↓↓

    # if you only want to check one specific userType ↓↓↓↓↓↓↓↓
  Scenario: Pre-Condition
    Given user is already logged in to CRM as "helpDesk"
                                             #  ↑↑↑↑↑    change the userType to specific userType
                                             # userType:  helpDesk   humanResources   marketing


  # if you want to check all userType at once ↓↓↓↓↓↓↓↓
  Scenario Outline: Pre-Condition
    Given user is already logged in to CRM as following "<userType>".
    # Put the main code here
    # Put the main code here
    # Put the main code here
    Examples:
      | userType       |
      | helpDesk       |
      | humanResources |
      | marketing      |


#----------------------------------------------------






