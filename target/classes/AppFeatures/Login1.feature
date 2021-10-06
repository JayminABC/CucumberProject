Feature: Check Login Functionality

Scenario: User Login With valid Credentials

Given Browser is open
And User is on Login Page of Walmart
When User Enter UserName "jayminmodi229@gmail.com" and Password "Jaymin229#"
And User Click on Sign In buttton
Then User Should be on Home Page


