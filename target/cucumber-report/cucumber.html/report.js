$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignIn.feature");
formatter.feature({
  "line": 2,
  "name": "signIn page Test",
  "description": "As user I want to Test sign in page.",
  "id": "signin-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 7227906500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#  @regression"
    }
  ],
  "line": 6,
  "name": "Verify that user should navigate to sign in page successfully",
  "description": "",
  "id": "signin-page-test;verify-that-user-should-navigate-to-sign-in-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User can see text \"AUTHENTICATION\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 108480800,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 9757231700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTHENTICATION",
      "offset": 19
    }
  ],
  "location": "SignInSteps.userCanSeeText(String)"
});
formatter.result({
  "duration": 50825900,
  "status": "passed"
});
formatter.after({
  "duration": 823129800,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Verify that user see error message with inValid redentials",
  "description": "",
  "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can see error message \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "message"
      ],
      "line": 19,
      "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;1"
    },
    {
      "cells": [
        "",
        "123456",
        "An email address required."
      ],
      "line": 20,
      "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;2"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "",
        "Password is required."
      ],
      "line": 21,
      "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;3"
    },
    {
      "cells": [
        "adfdfgfg",
        "123456",
        "Invalid email address."
      ],
      "line": 22,
      "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;4"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "123456",
        "Authentication failed."
      ],
      "line": 23,
      "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5729864700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify that user see error message with inValid redentials",
  "description": "",
  "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter username \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter password \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can see error message \"An email address required.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 58600,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 2427096500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 101505400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 137925700,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignInButton()"
});
formatter.result({
  "duration": 3283322600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "An email address required.",
      "offset": 28
    }
  ],
  "location": "SignInSteps.userCanSeeErrorMessage(String)"
});
formatter.result({
  "duration": 30868500,
  "status": "passed"
});
formatter.after({
  "duration": 689570500,
  "status": "passed"
});
formatter.before({
  "duration": 5799206700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify that user see error message with inValid redentials",
  "description": "",
  "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter username \"abcd@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter password \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can see error message \"Password is required.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 41200,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 2007038000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@gmail.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 67057200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 65300600,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignInButton()"
});
formatter.result({
  "duration": 725878500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password is required.",
      "offset": 28
    }
  ],
  "location": "SignInSteps.userCanSeeErrorMessage(String)"
});
formatter.result({
  "duration": 25906000,
  "status": "passed"
});
formatter.after({
  "duration": 703244000,
  "status": "passed"
});
formatter.before({
  "duration": 4359162300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify that user see error message with inValid redentials",
  "description": "",
  "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter username \"adfdfgfg\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter password \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can see error message \"Invalid email address.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 47900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 1809332500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adfdfgfg",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 69363400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 67956000,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignInButton()"
});
formatter.result({
  "duration": 1231633300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email address.",
      "offset": 28
    }
  ],
  "location": "SignInSteps.userCanSeeErrorMessage(String)"
});
formatter.result({
  "duration": 29057800,
  "status": "passed"
});
formatter.after({
  "duration": 686251200,
  "status": "passed"
});
formatter.before({
  "duration": 4612518800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify that user see error message with inValid redentials",
  "description": "",
  "id": "signin-page-test;verify-that-user-see-error-message-with-invalid-redentials;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enter username \"abcd@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter password \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can see error message \"Authentication failed.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 26900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 1242199800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@gmail.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 71722200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 83724600,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignInButton()"
});
formatter.result({
  "duration": 721454900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Authentication failed.",
      "offset": 28
    }
  ],
  "location": "SignInSteps.userCanSeeErrorMessage(String)"
});
formatter.result({
  "duration": 27032800,
  "status": "passed"
});
formatter.after({
  "duration": 675710200,
  "status": "passed"
});
formatter.before({
  "duration": 5232897200,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify that user should logIn successFully with valid credentials",
  "description": "",
  "id": "signin-page-test;verify-that-user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User enter username \"harshil34@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enter password \"rosep12\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User can see sinout link \"Sign out\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 30700,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 2677451800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "harshil34@gmail.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 77620200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rosep12",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 73311300,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignInButton()"
});
formatter.result({
  "duration": 3182555100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign out",
      "offset": 26
    }
  ],
  "location": "SignInSteps.userCanSeeSinoutLink(String)"
});
formatter.result({
  "duration": 32848800,
  "status": "passed"
});
formatter.after({
  "duration": 712861800,
  "status": "passed"
});
formatter.before({
  "duration": 4645354300,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Verify that user should logOut successFully",
  "description": "",
  "id": "signin-page-test;verify-that-user-should-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "User should in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User click on singin link",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User enter username \"harshil34@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enter password \"rosep12\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User click on signout button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User can see signIn link \"Sign in\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountPageSteps.userShouldInHomePage()"
});
formatter.result({
  "duration": 36900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageSteps.userClickOnSinginLink()"
});
formatter.result({
  "duration": 1276925900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "harshil34@gmail.com",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterUsername(String)"
});
formatter.result({
  "duration": 130890000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rosep12",
      "offset": 21
    }
  ],
  "location": "SignInSteps.userEnterPassword(String)"
});
formatter.result({
  "duration": 127321900,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignInButton()"
});
formatter.result({
  "duration": 2199960800,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnSignoutButton()"
});
formatter.result({
  "duration": 1771418600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 26
    }
  ],
  "location": "SignInSteps.userCanSeeSignInLink(String)"
});
formatter.result({
  "duration": 29117400,
  "status": "passed"
});
formatter.after({
  "duration": 695358500,
  "status": "passed"
});
});