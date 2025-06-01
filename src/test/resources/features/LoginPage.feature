Feature: Login ke aplikasi zaidan
  Background:
    Given User access Zaidan URL "http://ptbsp.ddns.net:6882/"
    Then User arrive at login page
  Scenario: Login invalid
    When User enters username as "indra" and password "admin123"
    Then User should be see error message "Username atau password salah"