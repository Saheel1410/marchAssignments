Feature: CreateLead testCase

Background:
Given Open the chrome browser
 Given Load the application url
 Given Enter the username as 'Demosalesmanager'
 Given Enter the password as 'crmsfa'
 And Click on login button
 And Click on CRMSFA link
 And Click on Leads button

@regression
Scenario Outline: TC_001 Creating A Sample Lead

 And Click on Create Leads button
 And Enter company as <cName>
 And Enter FirstName as <fName>
 And Enter SecondName as <sName>
 And Enter number as <phoNum>
 When Click the Submit button
 Then Verify Lead is created Successfully
 Given Click on close button
 
 Examples:
 |cName|fName|sName|phoNum|
 |'TestLeaf'|'Saheel'|'Khan'|'7639981110'|
 |'TestLeaf'|'Ram'|'ramaiah'|'9098'|
 
 @smoke
 Scenario: TC002 Editing the sample lead

Given Click on find Leads
And Click on phone button
And Enter Phone No as 7639981110
And Click on the Find Leads button
And Click on the first found lead
And Click on the Edit button
And Clear the company name field
And Enter company name as TCS
When Click on the submit button 
Then Verify the Change made
Given Click on close button