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
});