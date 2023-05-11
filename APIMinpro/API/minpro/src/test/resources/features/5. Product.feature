Feature: Product

  As a user
  I want to see the product on store
  So that I can make see product list

  Scenario: POST - Add new product product
    Given I set POST api endpoints product
    When I send POST HTTP request product
    Then I receive valid HTTP response code 200 product

  Scenario: POST - Add new product without Name payload
    Given I set POST api endpoints product
    When I send POST HTTP request product2
    Then I receive valid HTTP response code 500 product

  Scenario: POST - Add new product without Description payload
    Given I set POST api endpoints product
    When I send POST HTTP request product3
    Then I receive valid HTTP response code 400 product

  Scenario: GET - Get product by ID
    Given I set GET api endpoints product
    When I send GET HTTP request product
    Then I receive valid HTTP response code 200 product

  Scenario: GET - Get all product
    Given I set GET api endpoints product2
    When I send GET HTTP request product2
    Then I receive valid HTTP response code 200 product