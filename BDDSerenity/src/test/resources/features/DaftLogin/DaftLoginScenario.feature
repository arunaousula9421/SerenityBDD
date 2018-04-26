@DaftLogin @Smoke
Feature: Login into the Daft.ie
  As a User.
  I want to test login feature for Daft Website.
  So that I can perform both Successful and Unsuccessful scenarios.


  Background:
    Given Daft.ie has launched
    When Daft Website is launched
    And I am not logged in
    When I tap on Login link
    Then Login screen is displayed


  Scenario Outline: Successful Daft Login

    When I populate username "<username>"
    And I populate password "<password>"
    And I tap on the Login button
    Then Saved properties page is displayed

    @prod
    Examples:
      | username    | password     |
      | arunaousula | dsch9421     |

  @staging
    Examples: Valid Data
      |username     |password    |
      |arunaousula  |dsch9421    |


  Scenario Outline: Unsuccessful Daft Login

    When I enter Invalid username "<usernameInvalid>"
    And I enter Invalid password "<passwordInvalid>"
    And I tap on the Login button
    Then I should see "<error_message>"


  @prod
    Examples:
      | usernameInvalid    | passwordInvalid    | error_message                 |
      | invalid            | invalid            | Incorrect username or password|

  @staging
    Examples:
      | usernameInvalid    | passwordInvalid    | error_message                 |
      | invalid            | invalid            | Incorrect username or password|

