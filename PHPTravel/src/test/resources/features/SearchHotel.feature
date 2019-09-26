@SCENARIO
Feature: Hotel Booking Search

Scenario: Search hotel as Guest is successful
Given PHP Travel homepage is displayed
When User input data hotel
| city | London |
| check in | 27/09/2019 |
| check out | 28/09/2019 |
| guest | 2 |
And User click search
Then Verify hotel list is displayed
