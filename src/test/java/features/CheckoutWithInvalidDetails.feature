

Feature: checkout with insufficient details
 

 @reg
  Scenario: checkout with fisrt name and last name
     When user enter username "standard_user" and password "secret_sauce"
   And user click on login button
   And click on add to cart
   And click on basket
   And Click on checkout
   And enter firstname "amit" lastname "lamba" 
   And click on continue button
   Then validate text message

   @reg
  Scenario: checkout with fisrt name and zip code
  
    When user enter username "standard_user" and password "secret_sauce"
   And user click on login button
   And click on add to cart
   And click on basket
   And Click on checkout
   And enter firstname "amit" postal code "124001"
   And click on continue button
   Then validate text message
   
   @reg
   Scenario: checkout with last name and zip code
  
    When user enter username "standard_user" and password "secret_sauce"
   And user click on login button
   And click on add to cart
   And click on basket
   And Click on checkout
   And enter last name "lamba" postal code "124001"
   And click on continue button
   Then validate text message
   