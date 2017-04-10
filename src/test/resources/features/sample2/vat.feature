Feature: VAT Calculation

 Scenario: General Spanish VAT
   Given I get "diapers" with 100 price
   When tax is calculated
   Then the result should be 121

