$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/a.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing Autotrader.com",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "AutotraderSteps.user_is_in_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that \"Browse by Make\" are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.verify_that_are_present(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[text()\u003d\u0027Browse by Make\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027YCs-MacBook-Pro.attlocal.net\u0027, ip: \u0027fe80:0:0:0:1047:50a4:f7db:3fb8%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/8n/rp_xgxg96rs...}, goog:chromeOptions: {debuggerAddress: localhost:58362}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7662fb1004396ea7c050f66abd8f5440\n*** Element info: {Using\u003dxpath, value\u003d//button[text()\u003d\u0027Browse by Make\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.getText(Unknown Source)\n\tat com.autotrader.pages.AutotraderPage.verification(AutotraderPage.java:47)\n\tat com.autotrader.steps.AutotraderSteps.verify_that_are_present(AutotraderSteps.java:35)\n\tat ✽.Verify that \"Browse by Make\" are present(file:src/test/resources/features/a.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify that \"Browse by Style\" are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.verify_that_are_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Advanced Search\" are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.verify_that_are_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that search button is present",
  "keyword": "And "
});
formatter.match({
  "location": "AutotraderSteps.verify_that_search_button_is_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Any Make\" is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.verify_that_is_visible(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Entering the Advance search link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click Advance link on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AutotraderSteps.user_click_Advance_link_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"30004\" in the zip code text box",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_enter_in_the_zip_code_text_box(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027zip3004\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.121)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027YCs-MacBook-Pro.attlocal.net\u0027, ip: \u0027fe80:0:0:0:1047:50a4:f7db:3fb8%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_91\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/8n/rp_xgxg96rs...}, goog:chromeOptions: {debuggerAddress: localhost:58517}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f3959f0403ae90a1cda4553d9f744249\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027zip3004\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\n\tat com.autotrader.pages.AdvancedSearchPage.Zip(AdvancedSearchPage.java:62)\n\tat com.autotrader.steps.AutotraderSteps.user_enter_in_the_zip_code_text_box(AutotraderSteps.java:68)\n\tat ✽.User enter \"30004\" in the zip code text box(file:src/test/resources/features/a.feature:14)\n",
  "status": "failed"
});
formatter.step({
  "name": "User select \"Certified\" check box under \"Condition\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_select_check_box_under(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select \"Convertable\" check box under \"Style\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_select_check_box_under(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User update  year \"2017\" to \"2020\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_update_year_to(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select \"BMW\" car from Make,Model and Trim",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_select_car_from_Make_Model_and_Trim(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Search Button",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_clicks_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify that he is in result page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_verify_that_he_is_in_result_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify that he sees only \"BMW\" cars in listing",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.user_verify_that_he_sees_only_cars_in_listing(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Display in console, the number of cars listed in result page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutotraderSteps.display_in_console_the_number_of_cars_listed_in_result_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/autotrader.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing  the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Choose make as a \"\u003cModel\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Model"
      ]
    },
    {
      "cells": [
        "Auide"
      ]
    },
    {
      "cells": [
        "Mercedes"
      ]
    },
    {
      "cells": [
        "Toyota"
      ]
    },
    {
      "cells": [
        "Acura"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing  the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Choose make as a \"Auide\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutotraderSteps.choose_make_as_a(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.autotrader.steps.AutotraderSteps.choose_make_as_a(AutotraderSteps.java:116)\n\tat ✽.Choose make as a \"Auide\"(file:src/test/resources/features/autotrader.feature:6)\n",
  "status": "pending"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing  the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Choose make as a \"Mercedes\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutotraderSteps.choose_make_as_a(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.autotrader.steps.AutotraderSteps.choose_make_as_a(AutotraderSteps.java:116)\n\tat ✽.Choose make as a \"Mercedes\"(file:src/test/resources/features/autotrader.feature:6)\n",
  "status": "pending"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing  the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Choose make as a \"Toyota\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutotraderSteps.choose_make_as_a(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.autotrader.steps.AutotraderSteps.choose_make_as_a(AutotraderSteps.java:116)\n\tat ✽.Choose make as a \"Toyota\"(file:src/test/resources/features/autotrader.feature:6)\n",
  "status": "pending"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing  the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Choose make as a \"Acura\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutotraderSteps.choose_make_as_a(String)"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.autotrader.steps.AutotraderSteps.choose_make_as_a(AutotraderSteps.java:116)\n\tat ✽.Choose make as a \"Acura\"(file:src/test/resources/features/autotrader.feature:6)\n",
  "status": "pending"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "status": "passed"
});
});