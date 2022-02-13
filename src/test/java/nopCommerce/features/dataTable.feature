@login_datatable
Feature: datatable login
       
  @params_datatable
  Scenario Outline: Verify login page
    #Given Open NopCommerce Admin
     Then Input to Email textbox with "<Email>"
      And Input to Password textbox with "<Password>"
      #And Close app
  
    Examples: 
      | Email               | Password | 
      | admin@yourstore.com | 123123   | 
      
  @params_datatable_step
   
  Scenario Outline: Verify login page
    #Given Open NopCommerce Admin
     Then Input to Email and Password
      | Email   | Password   | 
      | <Email> | <Password> | 
     # And Close app
  
    Examples: 
      | Email               | Password | 
      | admin@yourstore.com | 123123   | 
      
      
      
        