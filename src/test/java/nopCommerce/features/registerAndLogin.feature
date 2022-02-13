
Feature: Register and Login

  @register_login
  Scenario: Register to system and login
  	#Open url
    Given Open Register page
    When Input to Email textbox
    And Click to Submit button
    Then Get User and password info
    When Back to Login page
    And Submit valid info to Login form
    Then Home page displayed

