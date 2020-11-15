@add
Feature: Add Book

  Background: Login as Librarian
    Given user is on the login page
    When user logs in as a librarian
    Then dashboard should be displayed

  Scenario Outline: As a User I should be able to add a book

    When User clicks "Books" module
    Then User should be navigated to Book Management
    When User clicks Add book button
    And User enters "<Book Name>", "<ISBN>", "<Year>", "<Author>", "<Description>" tables
    And User chooses "Romance" from Book Category
      #| Action and Adventure    |
      #      | Anthology               |
      #      | Classic                 |
      #      | Comic and Graphic Novel |
      #      | Crime and Detective     |
      #      | Drama                   |
      #      | Fable                   |
      #      | Fairy Tale              |
      #      | Fan-Fiction             |
      #      | Fantasy                 |
      #      | Historical Fiction      |
      #      | Horror                  |
      #      | Science Fiction         |
      #      | Biography/Autobiography |
      #      | Humor                   |
      #      | Romance                 |
      #      | Short Story             |
      #      | Essay                   |
      #      | Memoir                  |
      #      | Poetry                  |
    And User clicks on Save changes button
    Then User should be able see the confirmation message The book has been created.

    Examples:
      | Book Name | ISBN      | Year | Author  | Description     |
      | Ali Nino  | 987654321 | 2010 | Musa M. | Champions Team  |
     # | Ali Nino2 | 987654322 | 2015 | Musa M. | Champions Team2 |
     # | Ali Nino3 | 987654323 | 2020 | Musa M. | Champions Team3 |



