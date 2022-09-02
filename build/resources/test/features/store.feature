Feature: AndresCepeda
  Scenario: Interact on the page Store
    Given that enter the website  "https://andrescepeda.com.co/"
    When select the option Store and add two items to shopping cart and checkout
    Then you should validate that the information name price of the first and second item is displayed in the console and compared with a text