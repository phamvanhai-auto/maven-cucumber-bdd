
Feature: Register and Login

  @register_login
  Scenario: Register to system and login
  	Given Get login page Url
    When Open Register page
    And Input to Email textbox
    And Click to Submit button
    Then Get User and password info
    When Back to Login page
    And Submit valid info to Login form
    Then Home page displayed

