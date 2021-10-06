$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_Practice/CucumberBDDMvnWalmart/src/main/java/AppFeatures/Login1.feature");
formatter.feature({
  "line": 1,
  "name": "Check Login Functionality",
  "description": "",
  "id": "check-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Login With valid Credentials",
  "description": "",
  "id": "check-login-functionality;user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on Login Page of Walmart",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Enter UserName \"jayminmodi229@gmail.com\" and Password \"Jaymin229#\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Click on Sign In buttton",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Should be on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.browser_is_open()"
});
formatter.result({
  "duration": 3973568000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_login_page_of_walmart()"
});
formatter.result({
  "duration": 1992518900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jayminmodi229@gmail.com",
      "offset": 21
    },
    {
      "val": "Jaymin229#",
      "offset": 60
    }
  ],
  "location": "LoginSteps.user_Enter_UserName_and_Password(String,String)"
});
formatter.result({
  "duration": 342731500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_sign_in_buttton()"
});
formatter.result({
  "duration": 356039700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 5829984500,
  "status": "passed"
});
});