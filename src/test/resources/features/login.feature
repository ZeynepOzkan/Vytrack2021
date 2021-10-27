Feature: Users should be able login

  @wip
  Scenario: login as a driver
    Given the user is on the login page
    When the user enter the driver information
    Then the user should be able to login

    Scenario: login as store manager
      Given the user is on the login page
      When the user enter the store manager information
      Then the user should be able to login


    Scenario: login as sales manager
      Given the user is on the login page
      When the user enter the sales manager information
      Then the user should be able to login