Feature:Login as different users

  @wip
  Scenario Outline: login as different user
    Given the user logged in as "<userType>"
    When the user logs in using "<username>" and "<password>"
    Then the user should be able to login
    And the title contains "<title>"
    Examples:
      | userType      | username        | password    | title     |
      | driver        | user1           | UserUser123 | Dashboard |
      | sales manager | salesmanager101 | UserUser123 | Dashboard |
      | store manager | storemanager85  | UserUser123 | Dashboard |