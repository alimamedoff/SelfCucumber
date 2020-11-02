Feature: Add Book
  Background: Login
  Scenario: As a User I should be able to add a book

    When User clicks Books module
    Then User should be navigated to Book Management
    When User clicks Add book button
    And User enters "<Book Name>", “<ISBN>”, “<Year>”, “<Author>”, “<Description>” tables
      | Book name | ISBN      | Year | Author  | Description    |
      | Ali Nino  | 987654321 | 2020 | Musa M. | Champions Team |
    And choosing "Romance" from “<Book Category>”
    And User clicks on Save changes button
    Then User should able see the confirmation message The book has been created.



