Feature: AndresCepeda
  Scenario: Interact on the page Photos
    Given that enter the website "https://andrescepeda.com.co/"
    When select the option Photos and select the second image
    Then should validate that the information name, price of the first and second item, is displayed in the console and compared with a text.