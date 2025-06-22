
@tag
Feature: Check login functionality

  @tag1
  Scenario: check login functionality with valid credentials
  
   

  
  
    Given user is on loginpage
    When user enters valid username and password
    And click on login biutton
    Then user is navigated to the home page
    Then click on menu dropdown 
    
    @tag2
    Scenario Outline: check logout functionality

    