

Feature: Application Login
  I want to use this template for my feature file


  Scenario: Home Page default login
    Given User is on the netbanking landing page
       When User login into application with username and password
    Then Home page is opened
    And Cards are displayed
    
      Scenario: Home Page default login with Arguments
    Given User is on the netbanking landing page
       When User login into application with "userName" and "password"
    Then Home page is opened
    And Cards are displayed "true"
    
     Scenario: Home Page default login with Arguments
    Given User is on the netbanking landing page
       When User login into application with "userName" and "password2"
    Then Home page is opened
    And Cards are displayed "false"
    
    
  
