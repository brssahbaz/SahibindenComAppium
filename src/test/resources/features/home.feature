@SearchPage
Feature: Sahibinden

  @CheckResult
  Scenario: Check Search Result
    Given User should see the Home page
    When taps "Emlak" on Home page
    When taps "Konut" on Category page
    When taps "Satılık" on Category page
    When taps "Daire" on Category page
    Then should see Results on Result page

