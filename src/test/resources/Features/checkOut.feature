Feature: User should be able to checkout a flight
  @checkOut
  Scenario: User should be able to checkout a flight
    Given user should navigated to a page that has a "Official Ryanair website | Cheap flights from Ireland | Ryanair" title
    And user should be able to Login
    Then user should be able to select departure city "Spain" and airport "Barcelona"
    And user should be able to select destination city "Ireland" and airport "Dublin"
    When user select the flight date "2020-09-30"
    Then user can select type of passangers "1 Adults","0 Teens","0 Children","0 Infant" and click the seach button
    Given user should select the ticket
    When user enter the informations "Mr" "Mustafa" "Yagci" and click continue button
    Then user should select the seat preferance "Extra Legroom"
    And user should select the small bag
    Given user should be able to click basket
    Then user should be able to select country code and type phone number "600296046"
    And user should insert credit card informations





