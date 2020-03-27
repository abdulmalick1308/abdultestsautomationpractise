$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TestApplication.feature");
formatter.feature({
  "name": "Test Order placement",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Chrome and start the test application",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I Click on T Shirt Link",
  "keyword": "When "
});
formatter.step({
  "name": "I add a T Shirt to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "I click onm Proceed to Checkout",
  "keyword": "When "
});
formatter.step({
  "name": "I proceed to checkout without updating address",
  "keyword": "When "
});
formatter.step({
  "name": "I check terms and conditions in shipping",
  "keyword": "When "
});
formatter.step({
  "name": "I pay by bank wire",
  "keyword": "When "
});
formatter.step({
  "name": "cofirm my order",
  "keyword": "And "
});
formatter.step({
  "name": "user should be able verify the order in order history",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abdulmalick.a.r@gmail.com",
        "happyheart"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open Chrome and start the test application",
  "keyword": "Given "
});
formatter.match({
  "location": "TestOrder.open_Chrome_and_start_the_test_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"abdulmalick.a.r@gmail.com\" and \"happyheart\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_enter_valid_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on T Shirt Link",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_Click_on_T_Shirt_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a T Shirt to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_add_a_T_Shirt_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click onm Proceed to Checkout",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_click_onm_Proceed_to_Checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I proceed to checkout without updating address",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_proceed_to_checkout_without_updating_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check terms and conditions in shipping",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_check_terms_and_conditions_in_shipping()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I pay by bank wire",
  "keyword": "When "
});
formatter.match({
  "location": "TestOrder.i_pay_by_bank_wire()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cofirm my order",
  "keyword": "And "
});
