Feature: Login functionality for leaftaps
Scenario: TC001_login with positive credentials
 Given Open the chrome browser
 Given Load the application url
 Given Enter the username as Demosalesmanager
 Given Enter the password as crmsfa
 When Click on login button
 Then Homepage should be displayed