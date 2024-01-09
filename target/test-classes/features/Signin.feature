
Feature: login functionality of swaglab

@reg
  Scenario: validate login with vaild details
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    Then validate successful login
    
    