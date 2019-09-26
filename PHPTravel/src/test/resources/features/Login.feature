Feature: Login with existing account

Scenario: Sucessfully login with existing account
Given PHP Travels Login page is displayed
When User enter valid account
| Email | freddisitorus@mailinator.com |
| Password | password10 |
And User submit data on Login Page
Then Verify username is displayed correctly

