Feature: Login to Leaftap for Duplicate
Scenario Outline: Positive testing for duplicating the leaftap
Given Load the URL for Duplicating and maximize
When enter the username for Duplicating <username>
And enter the password for Duplicating <password>
And click the login button for Duplicating
And Click on crmfsa link for Duplicating
And click on the Leads tab for Duplicating
And click on the FindLead tab for Duplicating
And click on phonenumber tab for Duplicating
And Enter the Phonenumber for Duplicating <phonenumber>
And click on the FindLeads for Duplicating
And click the first displayed value for Duplicating
And Click on the duplicate lead button
And clear the textbox and update the company name <compname>
And click on createLead button for Duplicating

Examples:
|username|password|phonenumber|compname|
|'DemoCSR'|'crmsfa'|'9'|Humana|

