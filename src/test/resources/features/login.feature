@login
Feature: user should be able to login

  Scenario: login as a driver
    Given the user is on the login page
    And the user enters the driver information
    Then the user should be able to login
