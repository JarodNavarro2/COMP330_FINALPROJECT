Software Requirements Specification

for

MOIRA

Version 2.0 approved

Prepared by Navarro, Polley, Prestianni, Quinn, Tanaka

COMP 330-001 NAPO Solutions in Research

6 November 2017

Table of Contents

Table of Contents ii

Revision History ii

1\. Introduction 1

1.1 Purpose 1

1.2 Document Conventions 1

1.3 Intended Audience and Reading Suggestions 1

1.4 Product Scope 1

1.5 References 1

2\. Overall Description 2

2.1 Product Perspective 2

2.2 Product Functions 2

2.3 User Classes and Characteristics 2

2.4 Operating Environment 2

2.5 Design and Implementation Constraints 2

2.6 User Documentation 2

2.7 Assumptions and Dependencies 2

3\. External Interface Requirements 3

3.1 User Interfaces 3

3.2 Hardware Interfaces 3

3.3 Software Interfaces 3

3.4 Communications Interfaces 3

4\. System Features 4

5\. Other Nonfunctional Requirements 5

5.1 Performance Requirements 5

5.2 Safety/Security Requirements 5


  ---------- ---------- ------------------------ -------------
  MOIRA                     9 November, 2017     Prototype 2.0
                                                 
                                                 
  ---------- ---------- ------------------------ -------------

Introduction
============

Purpose 
--------

The following documentation will provide the necessary information for the MOIRA desktop application. This software requirements report will contain the scope, functional and non-functional requirements of the project, and recommendations to facilitate the development of the product.

Document Conventions
--------------------

This document has utilized Arial font for all body text and BlairMdITC TT for the cosmetic text featured on the cover. Corresponding section headings will be indicated in 24pt italicized font. Subsection headings will constitute 14pt bold and will be ordered numerically. The bodies of sections will have 12pt font and will consist of lists or bulleted and numbered text. A sky-blue and white gradient is utilized for aesthetic and ease of viewing purposes.

Intended Audience and Reading Suggestions
-----------------------------------------

1. Development team: This document constitutes a baseline by which the development team can comprehend the software’s requirements and the attributes thereof. It is recommended that the development team of MOIRA is to read this document thoroughly in order to understand the following guidelines and expectations.

2. Investors/clients: This document expands upon user constraints and expectations of the application, software, hardware, and provides a detailed explanation underlining the technical components of the system and its interaction among constituent parts and dependencies. It is recommended that investors and clients read section 2 to facilitate ease of understanding and utilization.

Product Scope
-------------

To contribute to its innate versatile nature, MOIRA is a native cross-platform desktop application for all latest Windows 10 and OSX systems. At a static level, MOIRA can serve as a means by which to organize departmental data across a multitude of levels within an enterprise. Upon the customized manual addition of personal attributes such as weekly availabilities, qualifications, limitations, age, seniority, etc, MOIRA will act as a powerful, accurate, and fast organizer in order to facilitate the pairing of company entities among other workable elements e.g. grouping employees to respective time slots and pairing employees with client availabilities. Due to the notion that weekly schedules should be posted around the same time each week and as far in advance as possible, manual interpretations of availabilities cannot keep up with the demanding economies across all sectors. As a whole, we hope that MOIRA will serve as a successful transition to automated workplace management from the more traditional means of the manual review of spreadsheets, helping to alleviate potential conflicts early. A market has already been proven as present and relevant with developed applications such as “wheniwork.com” and an employee scheduling application created by the payroll company Kronos. MOIRA anticipates exceeding previous scheduling endeavors by championing customizability and independence from contracts or other legally-binding deployment. Its attribute-based sorting also provides a novel addition to methods currently in effect.
    
Specifically, through its dynamic functionality, we intend to create a system by which employers can (1) store customized company data in an easy to retrieve yet secure manner (2) create and save group files depending on what parameters are being compared (3) implement a toggle setting by which parameters are being utilized as a root nodes e.g changing between listing employee names under shift availabilities or listing shift availabilities under employee names (4) micromanage customized attributes of each object in group on separate window (5) scroll through a drop down menu consisting of how attributes should be matched i.e. select between “equals”, “does not equal”, “less than”, “greater than”, etc. (6) send private invitations to for employees to edit their own availabilities and attributes via email and SMS without compromising confidential data. Features relating to the form and function of MOIRA will be influenced by: (1) the initial independent project inception and design from a previous primitive version, (2) the attainment of suggestions via the surveying of potential users, (3) internal conversations among development team in regards to implementation of functional and efficient algorithms to accompany original environment, (4) an artistic interpretive rendering in order to enable a user friendly and aesthetically pleasing visual interface.

I. Potential User #1 Jacqueline Walker - jwalker12@luc.edu
    A. Director of the Center for Tutoring and Academic Excellence at Loyola
    University Chicago
    B. Is tasked with the objective of pairing supplemental with certain qualifications to
    respective professors
    C. Faced with crowding in respective office space as a result of overlapping of
    schedules
    D. Scheduling corresponding supplemental instructors is cumbersome and can
    require a group of five employees months to organize, causing potential anxiety
    among workers who desire speedy schedule placements
    E. Suggests an interface that is easy to train employees to use

II. Potential User #2 Chelsea Metivier - cmetivier@luc.edu
    A. Assistant resident director with Loyola University Chicago Department of
    Residence Life
    B. Organization is responsible for the pairing of sporadic schedules of resident
    assistants with 24/7 work schedules
    C. Constant and pressing extraneous issues detract from the accurate and fast
    scheduling thereof.
    D. Often must manually determine appropriate times among schedules of residents
    in order to facilitate administrative conduct hearings.
    E. Application must be versatile for a wide array of parameters and secure
    sensitive information conforming with Title IX protocol

III. Potential User #3 Lisa Hilgenberg - lhilgenber@sralab.org
    A. Manager of volunteering at Chicago Rehabilitation Institute
    B. Scheduling involves thousands of volunteers and is outsourced to a slow and
    frustrating service performing spreadsheet interpretation manually
    C. Desires an independent platform that can easily be altered with the coming and
    going of volunteers
    D. Patient information must be secure in accordance to all federal mandates E. Mobility and transmission through email is crucial for timely responses

IV. Potential User #4 Matthew Quinn - matthew.t.quinn@att.net
    A. Project Manager, FIS Help Desk at BMO Harris Bank Support
    B. Although not concentrated on shift scheduling, client meetings are usually
    scheduled via Outlook Calendar
    C. The limitations of Outlook include the inability to collect outside criteria and
    create overlapping times in an autonomous fashion
    D. Physical calendars, written schedules, and work time projections E. Insists upon a modern and fast means by which to schedule events.&gt;

References
----------

[1] Thomas, Philip I. “Scheduling Algorithm with Optimization of Employee Satisfaction.”Philipthomas.com, May 2013, scheduling.philipithomas.com/ scheduling.pdf. 
[2] When I Work, wheniwork.com/employee-scheduling-software. 
[3] Schumann, Richard. “Work Schedules in the National Compensation Survey.” Work Schedules in the National Compensation Survey, www.bls.gov/ opub/mlr/cwc/work-schedules-in-the-national-compensation-survey.pdf. 
[4] Waters, Shari. “Factors in Scheduling for the Retail Manager.” The Balance, www.thebalance.com/scheduling-employees-2890449.

Overall Description
===================

Product Perspective
-------------------

The MOIRA desktop application is a novel system in the early stages of development. It was derived as means by which any client ranging from the corporate CEO to the small business owner can transition from an environment of the tedious management of spreadsheets to a focus on the direct functioning of clientele and employees, hence revitalizing the human element of the workplace and restoring a focus on objectives beyond logistics. Our application is a direct response to the sacrifice in the quality of goods and services as a result of the emphasis of expedience present throughout both private and public sectors. In aspiration that objectives are managed early and thoroughly, any resulting error in quality will be significantly reduced within the final product e.g misunderstandings in duties, a delay in delivery, etc.

The original implementation of the system consisted as a pseudo drag-and-drop console-based platform by which paths to Excel spreadsheets containing the information of workers and potential shifts could be input into the terminal, followed by a customized path to an output folder. The aforementioned execution was only applicable to the enterprise in which it was built and would require reconstruction of the entire existing algorithm in order to deploy the service for yet another institution.

Hence, deviating from its maiden stages, MOIRA has been expected to evolve into an application capable of serving clientele from all enterprises via customizable and self- contained data structures.

Product Functions
-----------------

MOIRA will be structured on a hierarchical level by which a single admin account is capable of visibility across all tiers of data. The administrative account will be capable of the customization of data viewership and the number of tiers present throughout the system. Individuals with access to succeeding accounts will have the ability to the level of clearance by which they were assessed i.e. an employee in the marketing department can see all other schedules within the marketing department but not within human resources. The admin, therefor, would hold access to all departments and all user data within.

Admin abilities include (but are not limited to): 
    (1) creating and sending to users parameters by which to organize 
    (2) adjusting the security level among all users 
    (3) customizing attributes by which to sort qualifications, availabilities, etc. 
    (4) viewing and receiving data in real time 
    (5) addition and deletion of objects within specified groups 
    (6) customize calendars and timetables to respective events/responsibilities 
    (7) the adjustment of parameters by which to sort.

From the user perspective, one will expect the following functionalities: 
    (1) the viewership of all information assigned to their respective tier 
    (2) response to pre-defined attributes and availability prompts in a spreadsheet and drop-down menu format  
    (3) direct data submission to admin for further interpretation.

User Classes and Characteristics
--------------------------------

The three types of users who will interact with the system include 1) the administrative official of an organization, 2) the employees of the aforementioned organization, and 3) clients receiving goods or services from the respective organization.

1) Admin - holds control over all interactive elements within databases and networks. Is responsible for maintaining up-to-date files in regards to company logistics, planning and scheduling based upon desired input criteria.

2) Employee - capable of customizing profile of information requested by the admin. Is able give preference to shifts and tasks and view the occupied shifts of other employees. Can trade shifts in real time upon being allotted permission. Access is limited to admin allowance.

3) Client - most limited access to company information parameters. Will be able to input availability and attribute parameters based upon admin (or employee) request.

Operating Environment
---------------------

This system is planned to be deployed for both personal computers and company networks for Mac OSX and Windows. Platforms must support internet connection and access to individual IMAP/POP3 email accounts.

Design and Implementation Constraints
-------------------------------------

To facilitate the real-time retrieval and dispersal of company information, an Internet connection is necessary.

User Documentation
------------------

To maximize simplicity, MOIRA will be deployed with unprecedented standards in usability. A README file will accompany all versions succeeding the prototype. On- screen descriptions of buttons will also be present in the final version. FAQ and 24/7 customer service will be provided upon future company evolution.

Assumptions and Dependencies
----------------------------

All licensed versions of MOIRA will be utilized exclusively on a desktop environment. In the event that the current MOIRA version lacks the hardware resources available, the application may not function according to its intended purpose, crash, or provide inaccurate data.

External Interface Requirements
===============================

User Interfaces
---------------

Upon initialization of product by the licensed administrator. A log-in page will facilitate the creation of a private account. All additional attempts at booting the application will require the aforementioned credentials.

Upon authentication, the admin will be prompted with an interface consisting of three windows, two horizontally juxtaposed to list the input parameters by which one is to compare, and a vertical window to output sorted and listed data files. The default options include two buttons “create new category” for each field, followed by buttons to “create new object”. Categories consist of groups formulated as a folder within the application support file and the objects include the individual entities to compare, listed as files within the previously created folder. A “toggle” button will also be present to alternate between the entities which are serving as the root nodes.

Upon the creation of an object, it will appear on the list as a clickable entity. Upon double clicking, another window will emerge. By default, a field will be present for the addition of available times for an employee, client, shift, etc. The user will be able to add as many time intervals as required for a particular object. An “add attribute” button will also be present in order to surgically implement parameters by which an entity is sorted. Attributes are able to be manipulated by user to conform to expectations in the sorting process. Such logical commands include “equals”, “does not equal”, “less than”, “greater than”, etc. Upon confirmation of time intervals and attributes, the user will save progress and a file is stored in application support, along with its icon within the GUI. Each group created can be retrieved for future analysis.

The output window will display each entity with its matching sub-entities upon clicking the “sort” command by the user. The information can be exported as a file of the users choice, along with the ability to send the output data directly by email.

An interactive calendar will also be present, along with a window that enables the admin to send availabilities and prompts directly to employees and clients via email.

(an artist’s rendering of the GUI is present on the current design report).

Hardware Interfaces
-------------------

Upon the desktop device by which the installed application and application support is stored, there exists no designated hardware beyond the device by which MOIRA was initialized and the devices of prospective employees/clients.

Software Interfaces
-------------------

To facilitate ease of usage and portability, the databases in which MORIA interacts will be entirely self-contained in regards to the reading and writing of data.


System Features
===============

The following section will explain in detail all functional objects and elements within the proposed user interface. Elements listed below will correspond to the each alphabetical designation located on the accompanying design document:

I. Main Interface

A. Assignee Field - A vector() of structs() in which objects to be assigned to available tasks and objectives are stored. Upon initial clicking of field, user will be prompted with the newGroup window by which the data structures within the struct() are defined throughout the entire vector. Upon the creation of a group, the user will be able to click the field again in order to create an entity within the rendered group. Information can be manually and systematically input into each declared data structure. Each struct() with a visual summary of its defined attributes will be stored in a list form with a scroll bar for easy access (see instantiated example). Defined structs() can once again be edited by double clicking or deleted by right clicking, followed by a prompt to verify the delete. Field will clear upon reboot or by total deletion following a save.

B. Assignment Field - A vector() of structs() in which objects involving tasks and objectives are stored, in queue to be paired with potential employees clients, etc. Upon initial clicking of field, user will be prompted with the newGroup window by which the data structures within the struct() are defined throughout the entire vector. Upon the creation of a group, the user will be able to click the field again in order to create an entity within the rendered group. Information can be manually and systematically input into each declared data structure. Each struct() with a visual summary of its defined attributes will be stored in a list form with a scroll bar for easy access (see instantiated example). Defined structs() can once again be edited by double clicking or deleted by right clicking, followed by a prompt to verify the delete. Field will clear upon reboot or by total deletion following a save.

C. Sorted Field - A terminal vector() of vectors() by which corresponding elements accurately sorted based upon matching attributes are displayed and stored. Upon initialization of sorted field, entities within both asignee and assignment field will be cross compared. Only entities by which all attributes match i.e. qualifications meet requirements, time tables of working shifts fall within worker availabilities, will an assignee be paired with an assignment. Upon successful pairing, all paired data will be output to admin for manual interpretation. Underneath each assignment, the admin can select an assignee by double clicking to "lock in" the assignee to the assignment, causing the string within the struct to receive a '*'. The admin may also choose to right-click to delete the proposed assignee from the assignment, hence removing the string from its corresponding vector().

D. Save Current Data - Data within all current assignee, assignment, and sorted fields will be stored on separate .txt files within application support. Files will be given names corresponding to their groups. In the event that a future group is titled an identical name as a pre-existing save file, the user will be prompted to change the name or overwrite the file.

E. Export - The user may export data within all current assignee, assignment, and sorted fields to accessible PDF, .txt, word processing documents. 

F. Import - Saved or external files transmitted to user can be reinstantiated into assignee, assignment, or sorted fields depending on which document they were derived.

G. Share - User may also choose to configure data to be transmitted to IMAP/POP3 external email accounts upon stratification of authenticated security clearances or directly upload to company databases.

H. Toggle Information Display - Display on sorted field can be toggled between presenting lists of paired potential asignees under assignment to presenting potential assignments under assignee. To preserve memory and efficiency, the algorithm need not be executed redundantly. Instead, upon runtime, a separate vector() of vectors() will be dynamically allocated to store data inverse from the default setting, simply by matching previously paired strings and reorganizing.

I. Add Group/Entity - A twofold button that either creates a new group within its corresponding field. If a new group has already been created within the field, it will serve as the sole means by which to declare a new entity within the group. Upon clicking, functionality highlighted in parts A and B will be activated accordingly.

II. newGroup Window

J. Add Attribute - Adding attributes build sub-data structures within all future elements to be created within the vector(). Attributes will remain common throughout all memebers of the group until otherwise deleted. User can select an unlimited number of attributes to declare depending on how precise she desires the sort to be across groups. Descriptive sub-attributes can also be instantiated, by which both parent and child attributes (e.g. MATH as main and 132 as sub) must correspond with the candidate in order to be paired on the sorted field. All descriptive information necessary for display but omitted for comparison should be written within the 'name" field and stored as a descriptive string.

III. newEntity Window

K. Editable Categorical Attribute - Categorical attributes are the simplest form of comparable attributes as they merely involve the boolean determination of equality across strings. User can manually input this field to be auto-corrected to match stored strings or select a drop-down menu from previously configured attributes by the admin. Categorical attributs can include: gender, department, education level, nationality, geographic location, etc.

L. Editable Numeric Attribute - Numeric attributes can be sorted based upon equivalence by default. Upon user demand, a drop-down menu can configure a logical operator on the attribute relevant to pairing. The options for such configuration include "equals", "does not equal", "greater than or equal to", "less than or equal to", "greater than", or "less than". Numeric attributes can include: age, seniority, security clearance, salary, commute distance, etc.

M. Editable Time Table Attribute - Time tables are instantiated via dynamic two-dimensional arrays. All even indexes (starting at 0) will contain "start" times and all odd indexes will contain "end" times. User can add unlimited ranges per each day of the week. User can also toggle between having input represent vacancies or occupied times. A simple subtraction algorithm will determine wether declared ranges by the assignee will "fit" within the time ranges of a particular assignment. Due to the notion that the time table comparison is a more memory intensive process than the previous attribute comparisons, it will be performed after numeric and categorical sorts have been executed.

Other Nonfunctional Requirements
================================

Performance Requirements
------------------------

The exchange of information on behalf of the admin among employees and clients will be relayed in a speedy and accurate manner. Any syntax errors upon authentication and utilization will be immediately corrected. Spelling and grammatical errors will also be flagged using an external API. The admin will be permitted to create groups and entities with ease. Entities will be able to input information upon request through email or otherwise external communication application. Any logical errors regarding mismatched attributes assigned will be corrected. Numerical sub-attributes will be unavailable for categorical attributes e.g. “greater than” will not be an option for “male” or “female” attribute. All saved files should be available upon retrieval in the event of program crashes. To authorized individuals, all data will be present upon immediate request. To ensure optimal experience, users will be entitled to updates and bug-fixes upon demand.

Safety/Security Requirements
-------------------

To preserve our commitment to privacy, all data will be encrypted to non-authorized individuals using reliable RSA elliptical curve cryptography.

All individual submissions of information will be collected in a secure manner. User identity will be based upon location and internet protocol. Only users with authorized access will view confidential information. All attempts of tampering or disabling the aforementioned software for personal gain or copyright infringement are constantly being monitored. Such actions constitute a breach of contract and could result in civil or criminal liability.

Security Requirements
---------------------

To preserve our commitment to privacy, all data will be encrypted to non-authorized individuals using reliable RSA elliptical curve cryptography.

All individual submissions of information will be collected in a secure manner. User identity will be based upon location and internet protocol. Only users with authorized access will view confidential information. All attempts of tampering or disabling the aforementioned software for personal gain or copyright infringement are constantly being monitored. Such actions constitute a breach of contract and could result in civil or criminal liability.

