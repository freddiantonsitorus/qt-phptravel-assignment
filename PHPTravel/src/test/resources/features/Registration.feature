Feature: New Customer Registration

Scenario: Successfully Register new customer
Given PHP Travels homepage open
When User click signup button
And User input data
| firstName | freddi |
| lastName | Sitorus |
| mobileNumber | 07785706038 |
| email | freddisitorus@mailinator.com |
| password | password10 |
| confirmPassword | password10 |
And User submit data on Registration Page
Then Verify my account page displayed



Scenario: Un-Successful Register new customer
Given PHP Travels homepage open
When User click signup button
And User input existing data
| firstName | freddi |
| lastName | Sitorus |
| mobileNumber | 07785706038 |
| email | freddisitorus@mailinator.com |
| password | password10 |
| confirmPassword | password10 |
And User submit data
Then Verify error message


