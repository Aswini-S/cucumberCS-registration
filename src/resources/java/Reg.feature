#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Register to TestMe Application

  Background: Launch TestMe Application
    Given User should be in Browser
    When User Enters the  TestMe Application URL
    Then Landed in TestMe App Home Page

  @tag1
  Scenario: Register to TestMe Application as New User
    Given User should click on Sign-Up button
    And fill up the new account form with the following data
      | User Name | First Name | Last Name | password | confirmpassword | Gender | E-mail        | Mobile Number | DOB       | Address               | Security Questions         | Answers |
      | fhgfghfghfhg    | Group      | group     | gp12345  | gp12345         | Female | Bow@gmail.com |    1234567890 | 5-10-1997 | perungulathur,Chennai | What is Your favour color? | Blue    |
    Then Click on Register Button
