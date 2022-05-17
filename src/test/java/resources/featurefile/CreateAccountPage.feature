Feature:Create account page test
  As user I want to Test create account page.

  Scenario:Verify that user should create account successfully
    Given   User should in home page
    When    User click on singin link
    And    User enter email id "pal34@gmail.com"
    And    User click on create an account button
    And    User enter Title "mrs"
    And    User enter First name  "avni"
    And    User enter Last name   "patel"
    And    User enter  Password "apj123"
    And    User select DateofBirth "23"
    And    User select MonthofBirth "9"
    And    User select YearofBirth "1994"
    And    User click checkBoxnewsletter
    And    User click checkBoxSpecialOffers
    And    User enter AddressFirstname"palpatel"
    And    User enter AddressLastname "patel"
    And    User enter Address"234 geourge street"
    And    User enter AddressCity"croydon"
    And    User select AddressState "uk"
    And    User enter AddressZip/PostalCode  "3345678"
    And    User select AddressCountry "United kingdom"
    And    User enter AddressMobile phone "9898989890"
    And    User senter Address alias for future reference "234 geourge street"
    And    User click on register button
    Then   User can see message"MY ACCOUNT"