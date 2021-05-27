@Delete
Feature: validate the deleting address feature for web application
				 Test the delete address
  @Delete1
  Scenario: Test the add address feature 
  	Given The tester click the signin link
  	And tester enters the valid username<username>
  	And tester enters the valid password<password>
  	When the tester clickon the login button
  	Then  the tester should be logged in successfully 
  	Given The tester click the address button
 	 	And delete the addresses in page
  	Then the address should be deleted successfully	
   
  Examples:
    |username|password|
    |harithilagar99@gmail.com|hari5678|