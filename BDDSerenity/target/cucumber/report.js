$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login/LoginScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Login into the Mail.com",
  "description": "As a Valid User\r\nI want to login to the mail\r\nSo that I can check my mails.",
  "id": "login-into-the-mail.com",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Success Login",
  "description": "",
  "id": "login-into-the-mail.com;success-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I use Valid \"\u003cuserName\u003e\" and Valid \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I perform Login Action",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see my Account Mails.",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "Valid Data",
  "description": "",
  "id": "login-into-the-mail.com;success-login;valid-data",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 13,
      "id": "login-into-the-mail.com;success-login;valid-data;1"
    },
    {
      "cells": [
        "serenitytraining",
        "Password01"
      ],
      "line": 14,
      "id": "login-into-the-mail.com;success-login;valid-data;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Success Login",
  "description": "",
  "id": "login-into-the-mail.com;success-login;valid-data;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I use Valid \"serenitytraining\" and Valid \"Password01\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I perform Login Action",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see my Account Mails.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "serenitytraining",
      "offset": 13
    },
    {
      "val": "Password01",
      "offset": 42
    }
  ],
  "location": "LoginStepDef.i_use_Valid_and_Valid(String,String)"
});
formatter.result({
  "duration": 180067413,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_perform_Login_Action()"
});
formatter.result({
  "duration": 75457,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.i_should_see_my_Account_Mails()"
});
formatter.result({
  "duration": 1606320,
  "status": "passed"
});
});