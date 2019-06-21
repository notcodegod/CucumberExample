Feature: Cucumber Investigation
  As a new user to cucumber
  I want to learn its features

  # Simple intro

  Scenario: I want to run a simple test in cucumber
    Given cucumber is set up correctly
    When  I run the test
    Then  I can see them run


  Scenario: if a users password is too short during registration i get an applicable error
    Given: I am on the registration page
    And input correct details until the password field
    When I input a passoword that is too short "11"
    Then I receive the error message


