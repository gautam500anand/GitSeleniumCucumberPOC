
Feature: Login into application E2E Test Case
 


  Scenario: Positive Test Validating login
    Given Initialize the browser with Chrome
    And Navigate to "http://qaclickacademy.com" site
    And Click on login link on homepage to land on secure sign in Page
    When User enters "test99@gmail.com" and "123456" and logs in
    Then Verify that user is successfully logged in


