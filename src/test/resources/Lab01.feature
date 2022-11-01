Feature: Financial Testing on herokuapp.com

  @TC01
  Scenario: Verify that "Get Quote" button  is navigating application
    Given The user wants to go herokuapp page
    When The user wants to click on Insurance title
    Then The user wants to click Get a Quote button
    And The user wants to verify that Get a Quote button is a navigating application

    @TC02
    Scenario: Verify that in finance detail you should be able to select only one option
      Given The user wants to go herokuapp page
      When The user wants to click on Insurance title
      Then The user wants to click Get a Quote button
      Then The user wants to click financial detail button
      And The user wants to verify that in financial detail tab the user can select only one option

      @TC03
      Scenario: Verify that when you complete application you should be able to see "Let us call you" button
        Given The user wants to go herokuapp page
        When The user wants to click on Insurance title
        Then The user wants to click Get a Quote button
        Then The user wants to select a vehicle year and vehicle make and vehicle model in vehicle details dropdown
        And The user wants to click next button
        Then The user wants to click Owned button in Financial Detail
        And The user wants to click next button
        Then The user wants to write an estimation km in select driving distance in the driver section
        Then The user wants to select an option to contribute annual driving distance in the driver section
        And The user wants to click next button
        Then The user wants to select a coverage date to start in coverage start date in the driver section
        And The user wants to click next button
        Then The user wants to select the options in discount section in saving and discount section
        And The user wants to click next button
        Then The user wants to write drivers license number in drivers license in the driver section
        Then The user wants to click next button
        Then The user wants to select an option in driver's license history section
        Then The user wants to click submit button
        Then The user wants to verify the application to see "Let us call you" button