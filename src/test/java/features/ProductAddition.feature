
Feature: add product to cart functionality

  @reg
  Scenario: product addition into cart
   When user enter username "standard_user" and password "secret_sauce"
   And user click on login button
   And click on add to cart
   And click on basket
   And Click on checkout
   Then Validate text message
    