@allUsers
Feature:Login as different users

  @driver
  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

  @salesManager
  Scenario: login as a sales manager user
    Given the user is on the login page
    When the user logs in using "salesmanager101" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

  @storeManager
  Scenario: login as a store manager user
    Given the user is on the login page
    When the user logs in using "storemanager85" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"