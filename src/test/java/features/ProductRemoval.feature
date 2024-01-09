
Feature: product removal Functionality

Scenario: check count in cart on product removal 
 When user enter username "standard_user" and password "secret_sauce"
   And user click on login button
   And click on add to cart
   And click on basket
   And click on remove button
   Then validate count on basket