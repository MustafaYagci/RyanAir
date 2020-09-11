Feature: User should be able to checkout a flight
  @checkOut
  Scenario: User should be able to checkout a flight
    Given user should navigated to a page that has a "Official Ryanair website | Cheap flights from Ireland | Ryanair" title
    And user should be able to Login
    Then user should be able to select departure city "Barcelona" and airport "Barcelona"
    And user should be able to select destination city "Ireland" and airport "Dublin"
    When user select the flight date "2020-09-26"
    Then user can select type of passangers "3 Adults","1 Teens","2 Children"," 0 Infant" and click the seach button
