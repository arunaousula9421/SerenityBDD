@Compose
Feature: Compose an Email via  Mail.com
  As a Valid User
  I want to compose an mail
  So that I can ccommincate with my mates

  Scenario Outline: Success Compose
    Given I have All Test Data "<userName>" "<password>" "<ToAddress>" "<Subject>" "<Body>" for Compose Sceanrio
    Given I use Valid "<userName>" and Valid "<password>"
    And I perform Login Action
    And I should see my Account Mails
    When I compose an email to "<ToAddress>"
    Then I Should see a successful mail sent.

    Examples: Valid Data
      |userName                   | password   | ToAddress                  | Subject  | Body        |
      |serenitytraining@mail.com | Password01 | serenitytraining@mail.com | TestMail | Hello Daft..|