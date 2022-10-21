Feature: Gudexams Functionality

  @Admin @Exam_Configuarions
  Scenario Outline: Gudexam Admin Login
    Given Browser
    And Admin Link
    And Select Role
    When Admin <uname> and <pass>
    When Enter Captcha for admin
    And Click on Login for admin login

    Examples: 
      | uname | pass     |
      | super | 12345678 |

  @Exam_Configuarions
  Scenario Outline: Add Institute
    When On Admin Home Page Click Exam Configuartions
    Then Click On Add Institute
    And Select User Type
    And Enter Username For Institute
    Then Enter Name Of Institute
    And Select Region
    Then Enter Email Id For Institute
    And Enter Mobile Number For The Institute
    Then Enter Password For Your Institute
    And Click Submit

  @Admin
  Scenario: Reset Exam
    Then click Reset Exam Link
    And Open Reset exam
    Then Enter Enrollment
    And Select Subject
    And Click Reset Exam

  @Admin
  Scenario: Allocate Exam
    Then Click Allocation Link
    And Open Student Subject Allocation
    Then Enter Student Enrollment
    And Select Subject for allocation
    And Click Allocate Exam

  @Regression
  Scenario: Gudexam Logout
    Then Once Successfull Login, Click Logout
    Then Close The Browser

  @Student
  Scenario Outline: Gudexam Login
    Given Browser
    And Link
    When Enter <username> and <password>
    When Enter Captcha
    When Check Privacy Policy
    And Click on Login

    Examples: 
      | username | password |
      |  3000532 | 12345678 |

  Scenario: Check all Exam Status
    Then click on ALL
    Then click on Yet To Start
    Then Click on Resume
    Then Click on Completed
    Then Click on Absent

  @Student
  Scenario: Start Stduent Exam
    When search subject and enter
    Then click proceed
    Then check instructions
    And continue exam

  @Student
  Scenario: Exam Process
    When On Exam Page Select option and save
    When On last question click End Exam
    And click yes to end exam
    And click Final end exam

  @Regression
  Scenario: Gudexam Logout
    Then Once Successfull Login, Click Logout
    Then Close The Browser
