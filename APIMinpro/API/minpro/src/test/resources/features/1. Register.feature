Feature: Register

  As a user
  I want to create new account
  So that I can login

  Scenario: POST - Register with valid data
    Given I set POST api endpoints register
    When I send POST HTTP request register
    Then I receive valid HTTP response code 200 register

  Scenario: POST - Register without fullname
    Given I set POST api endpoints register
    When I send POST HTTP request register2
    Then I receive valid HTTP response code 400 register

  Scenario: POST - Register without email
    Given I set POST api endpoints register
    When I send POST HTTP request register3
    Then I receive valid HTTP response code 400 register

  Scenario: POST - Register without password
    Given I set POST api endpoints register
    When I send POST HTTP request register4
    Then I receive valid HTTP response code 400 register

  Scenario: POST - Register with existed account
    Given I set POST api endpoints register
    When I send POST HTTP request register5
    Then I receive valid HTTP response code 400 register