$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/Myapplication.feature");
formatter.feature({
  "name": "Test HerokuApp Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Navigate to A/B Testing page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The URL \"https://the-internet.herokuapp.com\" is opened in Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuAppStep.the_URL_https_the_internet_herokuapp_com_is_opened_in_Chrome_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"A/B Testing\" link",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuAppStep.i_click_on_the_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the A/B page should be loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuAppStep.the_A_B_page_should_be_loaded(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to Checkboxes page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The URL \"https://the-internet.herokuapp.com\" is opened in Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuAppStep.the_URL_https_the_internet_herokuapp_com_is_opened_in_Chrome_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"CheckBoxes\" link",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuAppStep.i_click_on_the_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Checkboxes page should be loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuAppStep.the_A_B_page_should_be_loaded(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The URL \"https://the-internet.herokuapp.com/login\" is opened in Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HerokuAppStep.the_URL_https_the_internet_herokuapp_com_is_opened_in_Chrome_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valid username and password is provided",
  "keyword": "When "
});
formatter.match({
  "location": "HerokuAppStep.valid_username_and_password_is_provided()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HerokuAppStep.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "status": "passed"
});
});