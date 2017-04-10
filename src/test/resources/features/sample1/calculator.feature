Feature: Calculator
  As a user
  I want to use a calculator
  So that I don't need to calculate myself

  Scenario: Add two numbers
    When I add 2 and 3
    Then the result should be 5
    Given I have a calculator

  Scenario: Substract two numbers
    Given I have a calculator
    When I substract 5 and 3
    Then the result should be 2