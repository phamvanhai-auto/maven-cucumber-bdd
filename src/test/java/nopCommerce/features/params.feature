@login_params
Feature: Verify NopCommerce login page
 
 #Background: 
 	#Given Open NopCommerce Admin
 
  @params
  Scenario: Verify login page
    #Given Open NopCommerce Admin
    Then Input to Email textbox with "admin@yourstore.com"
    And Input to Password textbox with "123123"
   # And Close app
 
  @multi_params
  Scenario: Verify login page
    #Given Open NopCommerce Admin
    Then Input to Email textbox with "admin@yourstore.com" and Password textbox with "123123"
   # And Close app

      
      
      
        