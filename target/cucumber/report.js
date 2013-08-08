$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("derpbear/authentication.feature");
formatter.feature({
  "id": "logging-into-derp-bear",
  "description": "\nIn order to see the super secret pages\nas a visitor\nI want to Login to Derp Bear",
  "name": "Logging into Derp Bear",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 3030324000,
  "status": "passed"
});
formatter.scenario({
  "id": "logging-into-derp-bear;valid-user-login",
  "description": "",
  "name": "Valid user login",
  "keyword": "Scenario",
  "line": 8,
  "type": "scenario"
});
formatter.step({
  "name": "I visit derpbear",
  "keyword": "Given ",
  "line": 9
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I login",
  "keyword": "When ",
  "line": 10
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see the logged in message",
  "keyword": "Then ",
  "line": 11
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 596428000,
  "status": "passed"
});
formatter.before({
  "duration": 1806753000,
  "status": "passed"
});
formatter.scenario({
  "id": "logging-into-derp-bear;valid-user-login-other-example",
  "description": "",
  "name": "Valid user login other example",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I visit derpbear",
  "keyword": "Given ",
  "line": 14
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I login",
  "keyword": "When ",
  "line": 15
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see \"You are now Logged in.\"",
  "keyword": "Then ",
  "line": 16
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 597082000,
  "status": "passed"
});
formatter.before({
  "duration": 1847222000,
  "status": "passed"
});
formatter.scenario({
  "id": "logging-into-derp-bear;invalid-user-login",
  "description": "",
  "name": "Invalid user login",
  "keyword": "Scenario",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "I visit derpbear",
  "keyword": "Given ",
  "line": 19
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I login",
  "keyword": "When ",
  "line": 20
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see the logged in message",
  "keyword": "Then ",
  "line": 21
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 566293000,
  "status": "passed"
});
formatter.before({
  "duration": 1806490000,
  "status": "passed"
});
formatter.scenario({
  "id": "logging-into-derp-bear;invalid-user-login-other-example",
  "description": "",
  "name": "Invalid user login other example",
  "keyword": "Scenario",
  "line": 23,
  "type": "scenario"
});
formatter.step({
  "name": "I visit derpbear",
  "keyword": "Given ",
  "line": 24
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I login",
  "keyword": "When ",
  "line": 25
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see \"Username or Password incorrect!\"",
  "keyword": "Then ",
  "line": 26
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 578060000,
  "status": "passed"
});
});