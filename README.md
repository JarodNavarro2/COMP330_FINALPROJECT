This is the repository for Moira, an application for the final project of class COMP 330-Software Development as developed by Anchors of Astora, and this document is intended to act as instruction for running and using this application.

Contents
-Our Purpose
-Terms and Conditions
-Running Moira
-Using Moira - User’s Guide

Our Purpose

Moira has been developed to make scheduling among students more streamlined. Rather than having to make or compile and print spreadsheets to compare schedules with each other, Moira allows students to see each other’s schedule details in real time from anywhere. Users can join groups with their fellows, enter the details of their schedule, and compare their schedules with their groupmates.

Terms and Conditions

Moira is a work-in-progress build, currently at Final Beta. There might be bugs in the program.

Running Moira

Moira is run using an executable .jar file found in the GitHub repository or can be accessed through its VIM. 

To Access with GitHub
-Navigate to the project repository
-Open the folder labelled “moria”
-Open the folder labelled “dist”
-Select the file “moria.jar”
-Download the .jar file
-Navigate to where the .jar file has been saved
-Run the .jar file

To Access with GitHub Desktop
-Open Github Desktop
-Clone the project repository
-Navigate to where the project has been saved
-Open the project folder
-Open the folder labelled “moira”
-Open the folder labelled “dist”
-Run the .jar file

To Access with the VIM
-Navigate to the website gate.cs.luc.edu (guacamole)
-Login with the following credentials:
--Username: sql2017
--Password: Cs330luc
--Connect to the VIM
--Login using the same password as above

Using Moira - User’s Guide

The following section details the functions of the application Moira and how to use them.

Users must log into the application before it can be run. Details on how to create a new account and login are detailed below.

The application consists of a trio of grids; one for the user’s schedule information with refresh and add classes buttons below, one for the schedule information of every member of the group with a refresh option below, and one for information on the group members with a refresh option below. The grids are topped by a menu bar with three options - File, Edit, and Help. The functions of each of these options are detailed below.


Logging In
-For new users
--Click “New Account”
--In the respective boxes, enter:
---Your first name
---Your last name
---Your preferred username
---Your password
---The group you wish to join or create
--Click “Confirm”
--Enter your credentials in the respective boxes
--Click “Student Login”

-For returning users
--Enter your credentials in the respective boxes
--Click “Student Login”

Menu Bar - File

This option contains account and class creation tools, as well as an exit tool
-Create Account Prompt
--Keyboard Shortcut: F1
--This will bring up a prompt to create a new student account. See “new users” under “Logging In” for information on how to create a new account.
-Add Classes
--Keyboard Shortcut: F2
--This will bring up a prompt to add a new class to your schedule. See “add class” under “Grids - User” for information on how to add new classes.
-Quit
--Keyboard Shortcut: Esc
--This will logout the user and close the application

Menu Bar - Edit

This option contains tools to allow users to edit their account information
-Edit Account
--Keyboard Shortcut: N/A

Menu Bar - Help

This option contains tools to improve user experience
-Helpful Docs!
--Keyboard Shortcut: N/A
-Report Someone
--Keyboard Shortcut: N/A
--This will bring up a prompt to report another user
--To report another user:
---Enter the username of the offending user in the respective box
---Briefly explain why you are reporting this user in the respective box
---Click “Submit”

Grids - User

This grid, located in the upper left, displays the user’s personal class schedule. It has fields for the professor teaching the course, the name of the course, the days the class meets, and the time the class meets.
-Refresh My Classes
--This will refresh the grid, updating it with the user’s most recent changes to their schedule
-Add Class
--This will bring up a prompt to add a new class to the user’s schedule
--To add a new class:
---Enter the name of the professor
---Enter the name of the class
---Enter the start time of the class
---Enter the end time of the class
---Check the boxes on the side that correspond with the days of the week the class meets
---Click “confirm”
---If you wish to add another class, do so
---When you are finished adding classes, click “done”

Grids - Group Schedule

This grid, located in the lower left, displays the class schedules of the other members of the user’s group. It has fields for the professor teaching the course, the name of the course, the days the class meets, the time the class meets, and the user who is taking the class.
-Refresh My Group
--This will refresh the grid, updating it with the most recent changes to the schedules of the group members

Grids - Group Information

This grid, located in the upper right, displays the user information of all of the members of the user’s group. It has fields for the first and last names of the group members and their usernames.
-Refresh Members
-This will refresh the grid, updating it with the most recent changes to the group members

