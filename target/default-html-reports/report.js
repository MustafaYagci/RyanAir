$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/checkOut.feature");
formatter.feature({
  "name": "User should be able to checkout a flight",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to checkout a flight",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@checkOut"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should navigated to a page that has a \"Official Ryanair website | Cheap flights from Ireland | Ryanair\" title",
  "keyword": "Given "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_navigated_to_a_page_that_has_a_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to Login",
  "keyword": "And "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_be_able_to_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to select departure city \"Barcelona\" and airport \"Barcelona\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_be_able_to_select_departure_city_and_airport(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to select destination city \"Ireland\" and airport \"Dublin\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_be_able_to_select_destination_city_and_airport(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select the flight date \"2020-09-26\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_select_the_flight_date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can select type of passangers \"3 Adults\",\"1 Teens\",\"2 Children\",\" 0 Infant\" and click the seach button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_can_select_type_of_passangers_and_click_the_seach_button(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});