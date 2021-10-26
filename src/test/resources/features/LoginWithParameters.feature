Feature:Login as different users

  @userType
  Scenario Outline: Login with different <userType>
    Given login with different "<userType>"
    When the user enters "<username>" and "<password>"
    Then the title contains "<title>"


    Examples:
      | userType      | username        | password    | title     |
      | driver        | user1           | UserUser123 | Dashboard |
      | sales manager | salesmanager101 | UserUser123 | Dashboard |
      | store manager | storemanager85  | UserUser123 | Dashboard |