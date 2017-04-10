Feature: Search in Google

 Scenario: Getting results
   Given I am in "https://www.google.es/"
   And I fill "q" field with "claro que sí guapi"
   When I click "Buscar"
   Then some results are presented in the page
