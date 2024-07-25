Feature: Login page Automation of saucedemo App
Scenario Outline: Check login is Successful with valid cred
Given User is on login
When User enters valid "<username>" and "<password>"
And Click on login Button
Then User is navigated to home page
And close the browser


Examples:
| username | password |
| standard_user | secret_sauce |


