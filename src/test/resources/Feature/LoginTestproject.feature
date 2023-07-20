Feature: To test login functionality

Scenario Outline: Check login with valid credentials
Given browser is open
And user is on login page
When user enters <username> and <password>
And clicks on login button
Then user should be navigated to search result page 


Examples: 
|username|password|
|Dishita|12345|
|Satyendra|12345|
|Chandrakala|12345|