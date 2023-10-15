Feature: As an admin I should be able to Create a new employee and delete the employee which I created

  @wip
  Scenario:Create a new employee and verify if the name is in the list before and after deleting
    Given The user is on the login page
    When The user enters "admin" and "password"
    And The user navigates "Employee List"
    And The user creates a new employee
    And The user verify "name1" is in the list
    And The user deletes  "name1" from list
    Then The user verify "name1" isn`t in the list


