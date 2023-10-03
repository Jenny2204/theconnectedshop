Feature: Opening the main page
  Scenario:Opening the main page of theconnectedshop.com
    Given I open the website theconnectedshop.com
    Then The URL should contain theconnectedshop.com

    And Check title homePage
    And Check logo
   And Check main menu
    And Check NewIn button
    And Close site