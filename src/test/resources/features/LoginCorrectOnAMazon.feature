Feature: Login Feature correct
Scenario: Todays Deals and adding product keyboard into the cart
Given User is at the Login Page
When User clicks on Signin tab
And User enters the Email or mobile phone number as "918788584611" 
And User clicks on Continue button and User enters the password as "Pass@123"
And User clicks on Signin button
And User redirects to the Homepage
And User clicks on Todays deal
And User clicks on Mobile & computer accesories
And User navigate and clicks on mice and keyboard accesories
And User navigate and clicks on wired keyboard
And user navigate to next page and clicks on add to cart button
Then product should be added into the cart