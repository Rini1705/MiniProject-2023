Feature: User Information

  As a user
  I want to see user information
  So that I can see user information

  Scenario: GET - Get user information
    Given I set GET api endpoints user
    When I send GET HTTP request user
    Then I receive valid HTTP response code 200 user

  Scenario: GET - Get user information without token
    Given I set GET api endpoints user
    When I send GET HTTP request user2
    Then I receive valid HTTP response code 401 user
