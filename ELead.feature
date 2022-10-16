Feature: Login to Leaftap for editing
Scenario Outline: Positive testing for editing the leaftap
Given Load the URL for Editing and maximize
When enter the username for editing <username>
And enter the password for editing <Epassword>
And click the login button for editing
And Click on crmfsa link for editing
And click on the Leads tab for editing
And click on the FindLead tab
And click on phonenumber tab 
And Enter the Phonenumber <phonenumber>
And click on the FindLeads
And click the first displayed value
And Click on the Edit button
And update the company name <compname>
And click on update button

Examples:
|username|Epassword|phonenumber|compname|
|'DemoCSR'|'crmsfa'|'9'|'Tcs'|

