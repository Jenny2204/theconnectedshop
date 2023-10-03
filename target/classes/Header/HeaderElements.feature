Feature: Opening the main page
  Scenario:Opening the main page of theconnectedshop.com
    Given I open the website theconnectedshop.com
    Then The URL should contain theconnectedshop.com
#  And Check New in button
#    And Check Collections button
    And Close site