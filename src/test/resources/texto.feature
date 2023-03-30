Feature: Write a text

  As a user
  I want to Write a text in bold type

  Scenario Outline: Write a enriched text
    Given The user is in the page of text
    When the user write the enriched text "<text>"
    Then the user should see the text
    Examples:
    |text|
    |HHola como estas|