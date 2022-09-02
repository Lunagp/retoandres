Feature: enter the page
  Scenario: enter the page news
    Given that enters the website "https://andrescepeda.com.co/" n
    When select the News option
    Then must validate that the information of the first news provided by the page, is displayed in the console and compared with a text