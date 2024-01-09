
Feature: verify checkout functionality

  @reg
  Scenario: checkout with valid details
   When user enter username "standard_user" and password "secret_sauce"
   And user click on login button
   And click on add to cart
   And click on basket
   And Click on checkout
   And enter firstname "amit" lastname "lamba" and potsalcode "124001"
   And click on continue button
   And click on finish button
   Then validate checkout text
 