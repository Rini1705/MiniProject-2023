Feature: Register
  As a user
  I want to register account
  So that i can success register account


  Scenario Outline: As a user i want to register account
    Given I am on the product list
    When I click button sign in
    And I click text register
    And I input field fullname
    And I input field email
    And I input field password
    And I click register button
    Then I get result message in register