Feature: Register Feature

  Scenario: As user i have be able to success crete account
    Given I Open browserr
    When Open website alta-shopp
    When user input valid name
    And user input valid email
    And user input valid password
    And user click register button
    Then user success to create account and redirect to login

    Scenario: As user i have be able to fail crete account
      Given I Open browserr
      When Open website alta-shopp
      When user input empty fields name
      And user input empty fields email
      And user input empty fields password
      And user click register button
      Then user fail to create account and redirect to login