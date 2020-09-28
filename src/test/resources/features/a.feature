
Feature:
@Smoke
Scenario:Testing Autotrader.com
Given User is in landing page
Then  Verify that "Browse by Make" are present
Then  Verify that "Browse by Style" are present
Then  Verify that "Advanced Search" are present
And   Verify that search button is present
Then  Verify that "Any Make" is visible
@Smoke
Scenario: Entering the Advance search link
Given User click Advance link on the home page
Then  User enter "30004" in the zip code text box
Then  User select "Certified" check box under "Condition"
Then  User select "Convertable" check box under "Style"
Then  User update  year "2017" to "2020"
Then  User select "BMW" car from Make,Model and Trim
Then  User clicks Search Button
Then  User verify that he is in result page
Then  User verify that he sees only "BMW" cars in listing
Then  Display in console, the number of cars listed in result page

