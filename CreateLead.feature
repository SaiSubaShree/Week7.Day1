Feature: Testing  Leaftap
Scenario Outline: Login in to Leaftap
Given Load the Url and maximise the window
When the Provided username <username>
And the Provided password <password>
And click the Login button
Then Login page is loaded
And Click the CRMFSA Link
And Click on Leads tab
And click on Create Lead
And Enter the Companyname <companyname>
And Enter the Firstname <firstname>
And Enter the Lastname <lastname>
And Click on Create Lead button 
Then Verify CreateLead

Examples:
|username|password|companyname|firstname|lastname|
|'DemoCSR'|'crmsfa'|'info'|'Vidhu'|'shanka'|

