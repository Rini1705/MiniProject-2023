Feature: Categories

  As a user
  I want to create new category
  So that I can make more category

  Scenario: POST - Add new category
    Given I set POST api endpoints categories
    When I send POST HTTP request categories
    Then I receive valid HTTP response code 200 categories

  Scenario: POST - Add new category without description data payload
    Given I set POST api endpoints categories
    When I send POST HTTP request categories2
    Then I receive valid HTTP response code 200 categories

  Scenario: POST - Add new category without name data payload
    Given I set POST api endpoints categories
    When I send POST HTTP request categories3
    Then I receive valid HTTP response code 500 categories

  Scenario: GET - Get list all categories
    Given I set GET api endpoints categories
    When I send GET HTTP request categories
    Then I receive valid HTTP response code 200 categories

  Scenario: GET - Get categories by ID
    Given I set GET api endpoints categories
    When I send GET HTTP request categories2
    Then I receive valid HTTP response code 200 categories