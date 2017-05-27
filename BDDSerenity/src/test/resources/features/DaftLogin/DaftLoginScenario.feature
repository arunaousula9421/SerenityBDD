@DaftLogin @Smoke
Feature: Login into the Daft.ie
  As a Valid User.
  I want to login to the Daft Website.
  So that I can check my Ads.

  Scenario Outline: Successful Daft Login

    Given Daft.ie has launched
    When Daft Website is launched
    And I am not logged in
    When I tap on Login link
    Then Login screen is displayed
    When I populate username "<username>"
    And I populate password "<password>"
    And I tap on the Login button
    Then Saved properties page is displayed

    @prod
    Examples: Valid Data
      |username                  |password    |
      |arunaousula               |arunkumar123|
      |arunaousula               |arunkumar123|

    @staging
    Examples: Valid Data
      |username                  |password    |
      |arunaousula               |arunkumar123|
