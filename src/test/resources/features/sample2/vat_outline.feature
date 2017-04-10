Feature: VAT Calculation

  Scenario Outline: : Spanish VAT
    Given I have a VAT calculator
    When tax is calculated for "<product>" with <price> price
    Then the result should be <priceWithVAT>

    Examples:
      | product           | price | priceWithVAT |
      | diapers           |  100  |  121         |
      | bread             |  100  |  104         |
      | cinema tickets    |  100  |  110         |
