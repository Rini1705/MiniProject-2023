Feature: As user I want to logout in AltaShop

  Scenario: As user i have be able to logout in AltaShop
    Given i open browser - logout
    And i am on the home page - logout
    When i input valid email - logout
    And i input valid password - logout
    And i click login button - logout
    When i click account menu
    And i click Logout
    Then user successfull logout and redirect to login page