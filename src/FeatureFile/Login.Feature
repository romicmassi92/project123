login.feature

Scenario : User should be logged in  successfully with valid credential
Given User should be on login page
When User type the valid username 'Raj123'
And User type valid password Abc123
And User Click on login button
Then User should be logged in sucessfully

Scenario : User should not login with invalid username and valid password
Given User should be on login page
When User type invalid username 'John123'
And User type valid password  Abc123
And User Click on login button
Then User should not be able to login
And Error messege should be display

Scenario : User should not login  wih valid username and invalid password
Given User should be on login page
When User type valid username 'Raj123'
And User type invalid password Test123
And User click on login button
Then User should not be able to login
And Error messege should be display

Scenario : User should not login with Invalid username and Invalid password
Given User should be on login page
When User type Invalid username 'John123'
And User type invalid passowrd Test123
Then User should not be able to login
And Error messege should be display

Scenario : User should not login with Valid username and blank password
Given User should be on login page
When User type Valid username 'romic.masih'
And User not enter any  password
Then User should not be able to  login
And Error messge should be display


Scenario : User should not login  with blank username and blank password
Given User should be on login page
When User not type  any username
And User not type any password
Then User should not be able to login
And Error messege should be display

Scenario : User should not login with Blank username and valid password
Given User should be on login page
When User not type any username
And User type valid password 'Password@123'
Then User should not be able to login
And Error messege should be display

Scenario : User should not login with blank username and invalid password
Given User should be on login page
When User not type any username
And User type invalid password
Then User should not be able to login
And Error messege should be display