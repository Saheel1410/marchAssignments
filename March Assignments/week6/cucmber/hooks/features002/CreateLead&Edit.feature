Feature: CreateLead and EditLead testCase

#Background:
#Given Open the chrome browser
 
Scenario Outline: TC_001 Creating A Sample Lead
Given Load the application url
 Given Enter the username as <uName>
 Given Enter the password as <paasWord>
 And Click on login button
 And Click on CRMSFA link
And Click on Leads button
 Given Click on Create Leads button
 And Enter company as <cName>
 And Enter FirstName as <fName>
 And Enter SecondName as <sName>
 And Enter number as <phoNum>
 When Click the Submit button
 Then Verify Lead is created Successfully
 Given Click on close button
 
 Examples:
 |uName|paasWord|cName|fName|sName|phoNum|
 |'Demosalesmanager'|'crmsfa'|'TestLeaf'|'Saheel'|'Khan'|'7639981110'|
 |'Demosalesmanager'|'crmsfa'|'TestLeaf'|'Ram'|'ramaiah'|'9098'|
 
 Scenario Outline: TC002 Editing the sample lead
Given Load the application url
 Given Enter the username as <uName>
 Given Enter the password as <paasWord>
 And Click on login button
 And Click on CRMSFA link
And Click on Leads button
Given Click on find Leads
And Click on phone button
And Enter Phone No as <phonNum>
And Click on the Find Leads button
And Click on the first found lead
And Click on the Edit button
And Clear the company name field
And Enter company name as <compName>
When Click on the submit button 
Then Verify the Change made
Given Click on close button

 
 Examples:
 |uName|paasWord|phonNum|compName|
|'Demosalesmanager'|'crmsfa'|'7639981110'|'TCS'|
|'Demosalesmanager'|'crmsfa'|'9098'|'Wipro'|









