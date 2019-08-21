$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature456/mytest999.feature");
formatter.feature({
  "name": "Demo report validation on jenkins",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "My demo report validation in jenkins",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "TestMe is up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "testme_report.testme_is_up_and_running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "testme_report.user_enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify for login status",
  "keyword": "And "
});
formatter.match({
  "location": "testme_report.verify_for_login_status()"
});
formatter.result({
  "status": "passed"
});
});