@test_guru
Feature: Register/Login and New Customer

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

	@new_customer
	Scenario Outline: New Customer
		Given Open "New Customer" page
		When Input to "Customer Name" textbox with value "<CustomerName>"
		And Click to "Gender" radio button with value "f" 
		And Input to "Date of Birth" textbox with value "<DobIn>"
		And Input to "Address" textarea with value "<Address>"
		And Input to "City" textbox with value "<City>"
		And Input to "State" textbox with value "<State>"
		And Input to "PIN" textbox with value "<Pin>"
		And Input to "Mobile Number" textbox with value "<Phone>"
		And Input to "E-mail" textbox with value "<Email>"
		And Input to "Password" textbox with value "<Password>"
		And Click to "Submit" button
		Then Success message displayed with "Customer Registered Successfully!!!"
		Then The valid text displayed at "Customer Name" with value "<CustomerName>"
		And The valid text displayed at "Gender" with value "<Gender>"
		And The valid text displayed at "Birthdate" with value "<DobOut>"
		And The valid text displayed at "Address" with value "<Address>"
		And The valid text displayed at "City" with value "<City>"
		And The valid text displayed at "State" with value "<State>"
		And The valid text displayed at "Pin" with value "<Pin>"
		And The valid text displayed at "Mobile No." with value "<Phone>"
		And The valid text displayed at "Email" with value "<Email>"
		
    Examples: 
      | CustomerName | DobIn     | DobOut    | Gender | Address   | City   | State   | Pin    | Phone      | Email   | Password | 
      | Tony Teo     | 1995-02-20| 1995-02-20| female |54 Thái Hà | Ha Noi | Dong Da | 123456 | 0123456789 | tonyteo | 123123   | 
		
		
