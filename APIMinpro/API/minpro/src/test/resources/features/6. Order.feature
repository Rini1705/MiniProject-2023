Feature: Order

  As a user
  I want to order something
  So that I can order item that I want

  Scenario: POST - Add new orders
    Given I set POST api endpoints order
    When I send POST HTTP request order
    Then I receive valid HTTP response code 200 order

  Scenario: GET - Get all order
    Given I set GET api endpoints order
    When I send GET HTTP request order
    Then I receive valid HTTP response code 200 order

  Scenario: GET - Get all order without login
    Given I set GET api endpoints order
    When I send GET HTTP request order2
    Then I receive valid HTTP response code 401 order
