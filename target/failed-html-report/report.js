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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@type\u003d\u0027button\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.102)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-J6C5QTC\u0027, ip: \u0027192.168.1.137\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\musta\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64598}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: d62a56192596f4a4eb2cbb1010e4a06b\n*** Element info: {Using\u003dxpath, value\u003d//button[@type\u003d\u0027button\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.RyanAir.Pages.CheckOutPage.title(CheckOutPage.java:17)\r\n\tat com.RyanAir.StepDefs.checkOutStepDefs.user_enter_the_informations_and_click_continue_button(checkOutStepDefs.java:112)\r\n\tat ✽.user enter the informations \"Mr\" \"Mustafa\" \"Yagci\" and click continue button(file:///C:/Users/musta/IdeaProjects/RyanAir/src/test/resources/Features/checkOut.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should select the seat preferance \"Extra Legroom\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.RyanAir.StepDefs.checkOutStepDefs.user_should_select_the_seat_preferance(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});