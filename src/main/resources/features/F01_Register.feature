@smoke
  Feature: F01_Register | users could register with new accounts
    Scenario: guest user could register with valid data successfully
   # Given navigate to home page
    And  user go to register page
    When select gender type
    And user enter first name "automation" and last name "tester"
   And user enter date of birth
    And user enter email "test@example.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And   user confirm the password
    And user clicks on register button
    Then success message is displayed