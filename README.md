# WebJSP-RegistrationSys
This demo demonstrate java EE , Register user to the database and lookup from user. 
###Create the following Tables
*************************************************************
CREATE TABLE  "USERPROFILE" 
   (	"USERNAME" VARCHAR2(25), 
	"LASTNAME" VARCHAR2(25), 
	"USEREMAIL" VARCHAR2(50), 
	"USERCOUNTRY" VARCHAR2(25), 
	"GENDER" VARCHAR2(25)
   ) ;
*************************************************************
CREATE TABLE  "REGISTERUSER" 
   (	"NAME" VARCHAR2(25) NOT NULL ENABLE, 
	"PASS" VARCHAR2(25) NOT NULL ENABLE
   ) ;
*************************************************************
 ![image](https://user-images.githubusercontent.com/21217148/210176560-0feff4a6-755d-4c1f-bb9a-7179ab6eb413.png)
