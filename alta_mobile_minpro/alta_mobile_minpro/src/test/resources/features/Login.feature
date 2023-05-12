Feature: Login
  As a user
  I want to login
  So that i can access homepage


  Scenario Outline: As a user i want to login form my account
    Given I am on the product list
    When I click button sign in
    And I input field email in login 
    And I input field password in login
    And I click button login
    Then I get result the message

    