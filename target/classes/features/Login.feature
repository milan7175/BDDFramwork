	Feature: Amazon Login Feature

	Scenario: Amazon Login Test Scenario

	Given User is already on Login Page
	When title of Login Page is Amazon.ca: Low Prices – Fast Shipping – Millions of Items
	Then User hovers to Login element and click on SignIn
	Then User enter EmailId and click on continue
	Then User enter password and click on continue
	Then User is on Home Page