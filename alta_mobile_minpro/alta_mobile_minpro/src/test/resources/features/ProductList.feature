Feature: Product List
  As a user
  I want to beli
  So that i can success add product to cart


  Scenario Outline: As a user i want to add product to cart
    Given I am on the product list
    When I click button beli 
    Then Product successfully added to cart