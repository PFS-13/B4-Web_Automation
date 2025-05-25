Feature: Login ke aplikasi zaidan
  @InValidCredentials
  Scenario: Login invalid
    Given User already access Zaidan URL "http://ptbsp.ddns.net:6882"
    When User enters username as "indra" and password "admin123"
    Then User should be see error message "Incorrect username or password, please try again!"