Feature: Login

  As a user
  I want to see the products
  So that I can request to the api endpoints to login

  Scenario: POST - Login with valid account
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200 login

  Scenario: POST - Login with empty email
    Given I set POST api endpoints login
    When I send POST HTTP request login2
    Then I receive valid HTTP response code 400 login

  Scenario: POST - Login with empty password
    Given I set POST api endpoints login
    When I send POST HTTP request login3
    Then I receive valid HTTP response code 400 login

  Scenario: POST - Login without payload
    Given I set POST api endpoints login
    When I send POST HTTP request login4
    Then I receive valid HTTP response code 400 login

  Scenario: POST - Login with empty body parameter
    Given I set POST api endpoints login
    When I send POST HTTP request login5
    Then I receive valid HTTP response code 400 login