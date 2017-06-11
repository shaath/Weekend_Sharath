Feature: Login and Logout Test
	
		Scenario: Login Test
		 	Given The browser launched and navigated to url
		 	When the tester enters username and password
		 	And also clicks on login
		 	Then welcome admin message displayed
		 	
		 Scenario: Logout Test
		 	When the tester clicks on welcome admin link
		 	And also clicks on logout
		 	Then Login page displayed	
		 	