Feature: Logout dari aplikasi Zaidan
  Scenario: Logout success
    Given User already access Zaidan URL "http://ptbsp.ddns.net:6882" and logged in as "bendahara" with "admin123" password
    When User click logout button and click confirm button
    Then User should be see logo, title "Pengelolaan Dana Pendidikan Sekolah Zaidan Educare", and username password input field