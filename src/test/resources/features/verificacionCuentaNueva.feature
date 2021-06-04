#language: en
Feature: Verification of account created
  It will be verified that a new account has been created by validating the text of the welcome offer
  Scenario Outline: Account registration verification
    Given I enter the registration page
    When input registration data
      | name   | email   | password   |
      | <name> | <email> | <password> |
    Then the text of the welcome offer would be
      |textBienvenido  |
      |<textBienvenido>|
    Examples:
      | name      | email                 | password     | textBienvenido           |
      | Martin    | m10martin@gmail.com   | MartinAdmin  | What's in the Newsletter?|
      | Alejandro | a10alejo@gmail.com    | AlejoAdmin   | What's in the Newsletter?|
      | Pedro     | p10pedro@gmail.com    | PedroAdmin   | What's in the Newsletter?|
