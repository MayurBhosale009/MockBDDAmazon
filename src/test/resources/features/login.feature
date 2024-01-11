Feature: Login Feature
Scenario: Login Page of Amazon Site
Given User is at the Login Page
When User clicks on Signin tab
And User enters the Email or mobile phone number as "<username>" and User clicks on Continue button and User enters the password as "<password>"
| abc@gmail.com | pass@abc |
| 918788584611 | Pass@123 |
| mno@gmail.com | pass@mno |

#And User clicks on Continue button
#And User enters the password as "<password>"
#| pass@abc |
#| pass@mno |
#| Pass@123 |

And User clicks on Signin button
Then User redirects to the Home Page of Amazon Site