@MEETS-165
Feature:

  @MEETS-164 @MEETS-163
  Scenario: Contacts functionality Cucumber - Display Contact list - TDK
Feature: Contacts Functionality

  Scenario: Display all groups
    Given the user is on the login page
    When the user navigates to "Contacts"
    Then all contacts list must be displayed

	#Scenario: User can create a new contact
	#    Given the user is on the login page
	#    When the user navigates to "Contacts"
	#    Then the user can create a new contact
  @MEETS-166 @MEETS-163
  Scenario: Contact Functionality Cucumber - create new contact - TDK
  Scenario: User can create a new contact
    Given the user is on the login page
    When the user navigates to "Contacts"
    Then the user can create a new contact

	#Scenario: User can edit any selected contact
	#    Given the user is on the login page
	#    When the user navigates to "Contacts"
	#    Then the user can edit any selected contact
  @MEETS-168 @MEETS-163
  Scenario: Contacts Functionality with Cucumber - edit contact - TDK
  Scenario: User can edit any selected contact
    Given the user is on the login page
    When the user navigates to "Contacts"
    Then the user can edit any selected contact

	#Scenario: User can delete any selected contact
	#    Given the user is on the login page
	#    When the user navigates to "Contacts"
	#    Then the user can delete any selected contact
  @MEETS-170 @MEETS-163
  Scenario: Contacts Functionality with Cucumber - delete contact - TDK
  Scenario: User can delete any selected contact
    Given the user is on the login page
    When the user navigates to "Contacts"
    Then the user can delete any selected contact