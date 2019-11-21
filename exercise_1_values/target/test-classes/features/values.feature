Feature: Values page test 	

  @tag1
  Scenario: Validate Values Page Test
    Given User is already on the values page
    Then Verify the count of values is 12
    Then Verify the values on the screen are greater than 0
    Then Verify the total balance is equal to 1000000.0 
  	Then Verify the values are formatted as currencies
 
  