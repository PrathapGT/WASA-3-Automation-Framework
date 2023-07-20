#Author: your.email@your.domain.com
#Feature:Login
Feature: Login feature
  

  
  Scenario: Login to vTiger application with valid credentials
    Given I want to Launch the browser
    And I want to load the url
    When Login page is displayed enter valid credentials
    And click on login
    Then validate if homepage is displayed
 


