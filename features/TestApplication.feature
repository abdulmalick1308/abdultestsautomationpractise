Feature: Test Order placement

  Scenario Outline: Test login with valid credentials
    Given Open Chrome and start the test application
    When I enter valid "<username>" and "<password>"
    When I Click on T Shirt Link
    When I add a T Shirt to the cart
    When I click onm Proceed to Checkout
    When I proceed to checkout without updating address
    When I check terms and conditions in shipping
    When I pay by bank wire
    And cofirm my order
    Then user should be able verify the order in order history
    Then orderId should match

    Examples: 
      | username                  | password   |
      | abdulmalick.a.r@gmail.com | happyheart |
