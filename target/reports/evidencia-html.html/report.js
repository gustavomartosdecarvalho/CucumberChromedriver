$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TestGoogle.feature");
formatter.feature({
  "name": "Google PageObject",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Open Google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser and navigate to \"https://www.google.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestGoogleStep.i_open_the_browser_and_navigate_to_google(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the title",
  "keyword": "Then "
});
formatter.match({
  "location": "TestGoogleStep.i_validate_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});