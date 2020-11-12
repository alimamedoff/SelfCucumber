
Feature: Return Book
  Agile story: As a user I should be able to return the borrowed book by clicking on “Return Book” button under “Borrowing Books” module

  Background: Login
    Given user is on the login page

  @student21
  Scenario Outline: Return a book
    When user logs in as a "<role>"
    When user finds desired "<book>"
    Then once book is read user should be able to return it by clicking one "Return Book" button
    Examples:
      | role      |
      | student21 |




