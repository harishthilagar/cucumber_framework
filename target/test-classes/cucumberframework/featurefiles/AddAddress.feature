@Add
Feature: validate the adding address feature for web application
				 Test the new address
  @Add1
  Scenario: Test the add address feature 
  	Given The tester click the signin link
  	And tester enters the valid username<username>
  	And tester enters the valid password<password>
  	When the tester clickon the login button
  	Then  the tester should be logged in successfully 
  	Given The tester click the address button
 	 	And The tester fill the address data
 	 	  |Yes|tc1|firstname1|lastname1|address1|city1|a1234|
      |Yes|tc2|firstname2|lastname2|address2|city2|b1234|
  	Then the address should be added successfully	
   
  Examples:
    |username|password|
    |harithilagar99@gmail.com|hari5678|
  
