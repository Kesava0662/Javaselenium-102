Feature: Web Actions ACT 31
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@The_Internet_1
@uida1592800312
@set21
@test001
@Form_Authentication
Scenario Outline: Form Authentication
Given I have access to application
When I scroll and click Form Auth link1 in the internet
And I entered Username_T in form authentication as 'tomsmith'
And I clear text Username_T in form authentication
And I copied text Login page_TB in form authentication
And I enter copied text Username_T in form authentication
And I clear and enter text Username_T in form authentication as '<Username_T1>'
And I clear text Username_T in form authentication
And I copied text usename head_link in form authentication
And I enter copied text Username_T in form authentication
And I copied text password head_label in form authentication
And I enter copied text Username_T in form authentication
And I entered Password_TA in form authentication as 'new user'
And I clear text Password_TA in form authentication
And I entered Password_TA in form authentication as '<Password_TA2>'
And I clear and enter text Password_TA in form authentication as '<Password_TA3>'
And I selected Login_button in form authentication

Examples:
|SlNo.|Username_T1|Password_TA2|Password_TA3|
|1|wrong value|wrong enter|correct value|

#Total No. of Test Cases : 1

