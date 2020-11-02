Feature: As a User should be able to Login
  Scenario: Login
    Given navigate to URL
    When I input username, password and click the Login button
    Then I should navigate to the Homepage