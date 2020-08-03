Feature: Login tests

@test1
Scenario: Successful login with valid credentials
	Given User Launch Chrome Browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link	
	Then Page Title should be "Your store. Login"
	And close broswer	
	
@test2	
Scenario Outline: Successful login with valid credentials - Data Driven
	Given User Launch Chrome Browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters Email as "<email>" and Password as "<password>"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on Log out link	
	Then Page Title should be "Your store. Login"
	And close broswer
	
Examples:
| email                             | password     |
| admin@yourstore.com               | admin        |
| admin1@yourstore.com              | admin123     |

@test3
Scenario: Successful login with valid credentials Using extrenal test data
	Given User opens URL
	When User enters username and password
	And User click on Login button
	Then User verify page title
	When the User click on Log out link	
	Then close the broswer

