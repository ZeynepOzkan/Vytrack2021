Feature: Users should be able login

  Background:
    Given the user is on the login page
    Then the user should be able to login

  @wip
  Scenario: login as a driver
    When the user enter the driver information

    Scenario: login as store manager
      When the user enter the store manager information

    Scenario: login as sales manager
      When the user enter the sales manager information
