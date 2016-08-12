Feature: LogIn Feature

  Scenario: you can type here to explain the scenario. Blah blah.....User gives valid credentials and login to the system  
  
    Given User goes to home page    
    When User enters valid username and password
    Then User should be able to login successfully 
    
    
    Scenario Outline: you can type here to explain the scenario. Blah blah.....User gives invalid credentials and should fail to login to the system  
  
    Given User goes to home page    
    When user logs in using invlaid username "<username>" and password "<password>"
    Then user should be stayed on the same loginpage and display error
    
    Examples:
    
    |username|password|
    |userid1|password1|
    