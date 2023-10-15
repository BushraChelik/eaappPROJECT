Feature: User Login and Create a New Employee Test

  @wip
  Scenario:  Login and New Create Test
    Given The user is on the login page
    When The user enters "admin" and "password"
    And The user navigates "Employee List"
    And The user creates a new employee
    And The user verify "name1" is in the list
    And The user deletes  "name1" from list
    Then The user verify "name1" isn`t in the list


