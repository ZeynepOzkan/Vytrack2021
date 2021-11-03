Feature: Account types

  Scenario Outline:Login with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" "<module>"
    Then the title contains "<title>"

    Examples:
      | userType | tab   | module           | title                                                          |
      | driver   | Fleet | Vehicles         | Car - Entities - System - Car - Entities - Car                 |
      | driver   | Fleet | Vehicle Odometer | Vehicle Odometer - Entities - System - Car - Entities - System |
     # | driver   | Fleet | Vehicle Costs    |