Feature: Login Feature

  Scenario: as a user i have be able to success login
    Given I Open browser
    When Open website alta-shop
    And I Enter a valid email and password
    And I click login button
    Then I am on the home page

  Scenario: as a user i have be able to invalid login
    Given I Open browser
    When Open website alta-shop
    When I Enter a invalid email and password
    And I click login buttonn
    Then User see error message record not found