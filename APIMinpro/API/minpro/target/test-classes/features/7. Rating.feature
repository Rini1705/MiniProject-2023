Feature: Rating

  As a user
  I want to rate item
  So that I can give my rating

  Scenario: POST - Give product rating
    Given I set POST api endpoints rating
    When I send POST HTTP request rating
    Then I receive valid HTTP response code 200 rating

  Scenario: POST - Give product rating out of bond
    Given I set POST api endpoints rating2
    When I send POST HTTP request rating2
    Then I receive valid HTTP response code 500 rating

  Scenario: GET - Get product rating
    Given I set GET api endpoints rating
    When I send GET HTTP request rating
    Then I receive valid HTTP response code 200 rating