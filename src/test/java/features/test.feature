Feature: guru99 LogIn page

  Scenario: verify Login of guru99 page
    Given Login page is open
    When Enter the username and password
    And click on the submit button
    Then User should be in the login page
