
@login
Feature: Login feature
  Agile Story: As a user, I should be able to login with valid credentials

    Background:
      Given user is on the login page

    @librarian
    Scenario: Login as a librarian
      When user login as a librarian
      Then dashboard should be displayed

    @student21
    Scenario: Login as a studentOne
      When user login as a studentOne
      Then dashboard should be displayed

    @student22
    Scenario: Login as a studentTwo
      When user login as a studentTwo
      Then dashboard should be displayed


