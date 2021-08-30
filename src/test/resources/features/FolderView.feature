Feature: change folder view

  Background:
    Given the user is on the login page
    And the user enters the employee information
    Then the user should be able to login


 @name
  Scenario: user can change folder view by Name

    And  user should see following files
    |Readme                          |
    |BDD and Cucumber intorduction (1) |
    |Talk |
    |Notes|
    Then the user clicks on Name
    And user should see the changes of the order of files view like following
    |Notes|
    |Talk |
    |BDD and Cucumber intorduction(1) |
    |Readme                           |







   @outline:
    Scenario Outline: folder view should be changed by <button>
    And the user should see files dynamically
    Then the user clicks on "<button>"
    And the user should see changed files

    Examples:
    |button|
    |Name  |
    |Size  |
    |Modified|









