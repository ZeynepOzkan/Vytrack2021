Feature: Different account types

  Scenario Outline: Login with different accounts <userType>
    Given the user logged in as "<userType>"
    When the user navigates to "<tab>" "<module>"
    Then the title contains "<title>"

    Examples:
      | userType      | tab        | module               | title                                                   |
      | store manager | Dashboards | Dashboard            | Dashboard - Dashboards                                  |
      | store manager | Dashboards | Manage Dashboards    | All - Manage Dashboards - Dashboard                     |
      | store manager | Fleet      | Vehicles             | All - Car - Entities - System - Car - Entities - System |
      | store manager | Fleet      | Vehicle Odometer     | Dashboard                                               |
      | store manager | Fleet      | Vehicle Costs        | All - Car - Entities - System - Car - Entities - System |

     #| store manager | Fleet      | Vehicle Contracts    |
     #| store manager | Fleet      | Vehicles Fuel Logs
     # | store manager | Fleet      | Vehicle Service Logs
     # | store manager | Fleet      | Vehicles Model
