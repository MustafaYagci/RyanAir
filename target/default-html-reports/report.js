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
  "name": "user should be able to select departure city \"Spain\" and airport \"Barcelona\"",
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
  "name": "user select the flight date \"2020-09-30\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_select_the_flight_date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can select type of passangers \"1 Adults\",\"0 Teens\",\"0 Children\",\"0 Infant\" and click the seach button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_can_select_type_of_passangers_and_click_the_seach_button(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the ticket",
  "keyword": "Given "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_select_the_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the informations \"Mr\" \"Mustafa\" \"Yagci\" and click continue button",
  "keyword": "When "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_enter_the_informations_and_click_continue_button(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the seat preferance \"Extra Legroom\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_select_the_seat_preferance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the small bag",
  "keyword": "And "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_select_the_small_bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to click basket",
  "keyword": "Given "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_be_able_to_click_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to select country code and type phone number \"600296046\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_be_able_to_select_country_code_and_type_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should insert credit card informations",
  "keyword": "And "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_insert_credit_card_informations()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});