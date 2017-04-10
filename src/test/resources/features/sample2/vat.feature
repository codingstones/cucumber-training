Feature: VAT Calculation

  Scenario: Spanish VAT
    Given I have a VAT calculator
    When tax is calculated for "diapers" with 100 price
    Then the result should be 121

  Scenario: Spanish VAT
    Given I have a VAT calculator
    When tax is calculated for "bread" with 100 price
    Then the result should be 104

  Scenario: Spanish VAT
    Given I have a VAT calculator
    When tax is calculated for "cinema tickets" with 100 price
    Then the result should be 110