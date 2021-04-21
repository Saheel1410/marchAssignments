Feature: DuplicateLead TestCase

Scenario Outline: TC_003 Sample test for duplicate lead
Given Load the application url
 Given Enter the username as <uName>
 Given Enter the password as <paasWord>
 And Click on login button
 And Click on CRMSFA link
And Click on Leads button
 Given Click on Create Leads button
Given Click on find Leads
And Click on phone button
And Enter Phone No as <phonNum>
And Click on the Find Leads button
And Click on the first found lead
And Click on DuplicateLead button
When Click on the submit button new
Given Click on close button

 Examples:
 |uName|paasWord|phonNum|
|'Demosalesmanager'|'crmsfa'|'7639981110'|
|'Demosalesmanager'|'crmsfa'|'9098'|