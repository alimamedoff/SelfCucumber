
@login
Feature: Login feature
  Agile Story: As a user, I should be able to login with valid credentials

    Background:
      Given user is on the login page

    @librarian
    Scenario: Login as a librarian
      When user logs in as a librarian
      Then dashboard should be displayed

    @student21
    Scenario: Login as a studentOne
      When user logs in as a studentOne
      Then dashboard should be displayed

    @student22
    Scenario: Login as a studentTwo
      When user logs in as a studentTwo
      Then dashboard should be displayed


    Scenario: Table columns names
      When user logs in as a librarian
      And dashboard should be displayed
      And User clicks "Books" module
      Then table should have following column names:
        | Actions     |
        | ISBN        |
        | Name        |
        | Author      |
        | Category    |
        | Year        |
        | Borrowed By |


