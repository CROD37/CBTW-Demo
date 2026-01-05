Feature: Find a pet in the pet store

  As a pet store customer
  I want to search for a pet using its identifier
  So that I can confirm the pet exists and view its details

  Scenario: Find an available pet by its identifier
    Given the pet "Rocky" is "available" in the pet store
    When I search for the pet using its identifier
    Then I should see the pet "Rocky" as the result with status "available"