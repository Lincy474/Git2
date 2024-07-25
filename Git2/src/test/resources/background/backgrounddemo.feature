Feature: This is background demo

  Background: User is logged in to saucedemo app
    Given User is accessing saucedemo app
    When Usser enters valid username and password
    Then User should be able to navigate to home page

  Scenario: Test menu Items
    And click on breadcrum icon
    Then User should be able to see the menu items

  Scenario: Verify add to cart functionally
    Given User access the saucedemo app login page
    When Users enter the valid creds
    And Clicks on Add to Button
    Then Item should be added to the cart
