Feature: Test HerokuApp Website

  #Scenario: 
   # Given The Application is opened in Chrome browser
    #When link is clicked
    #Then Page should be displayed
    
Scenario: Navigate to A/B Testing page
    Given The URL "https://the-internet.herokuapp.com" is opened in Chrome browser
    When I click on the "A/B Testing" link
    Then the A/B page should be loaded    
    
Scenario: Navigate to Checkboxes page
		Given The URL "https://the-internet.herokuapp.com" is opened in Chrome browser
		When I click on the "CheckBoxes" link
    Then the Checkboxes page should be loaded
    
 Scenario: Login with valid credentials
 		Given The URL "https://the-internet.herokuapp.com/login" is opened in Chrome browser
 		When Valid username and password is provided
 		Then User should be able to login successfully
 		
 		
    