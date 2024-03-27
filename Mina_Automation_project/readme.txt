Task Notes :

1) This project I ran on chrome version 123 so I downloaded chrome driver version 123 , 
make sure chrome version is compatible with the driver
2) Java version 8
3) selenium version 4.4.0
4) TestNG version 7.6.1

Project Flow :
1) Public class called  { PHP_TRAVEL } which contain all the methods to run 
2) Public class called { Login_ process } which contain POM Design pattern for the login
3) Public class called { Registeration_proccess } which contain POM Design pattern for the Registeration
4) The Project contains 5 methods for the registeration process 
   - Success_Registeration : Validate successful registeration
   - Failed_Registeration_user_name : Validate unsuccessful regestiration when enter user name begin with small letter
   - Failed_Registeration_mobile_number : Validate unsuccessful regestiration when enter invalid mobile number
   - Failed_Registeration_Email : Validate unsuccessful regestiration when enter a used email
   - Failed_Registeration_Password : Validate unsuccessful regestiration when enter when enter a 
                                     password that doesn't meet the required criteria
Notes :
-  I added a thread in each regestiration menthode for about one minute in the step of checking the
   check box of " I am not a robot " because this can't be automated and it must be checked manualy so I give time one minute for each regestiration methode
   to be checked manualy
- Please make sure for each method for the regestiration to enter new email except for the methode of 
  { Failed_Registeration_Email } leave the existing email as it is to validate an registered email



5) The Project contains 3 methods for the login process 

   - Success_Login : validate successful login when typing valid credentials
   - Failed_Login_Email : Validate unsuccessful login when typing invalid email
   - Failed_Login_password : Validate unsuccessful login when typing invalid password
Notes: 
- No need to do anything with the login methodes just run it as it is

* To open the report open the module called { test- output } where under it you can find emailable- report 
in html format you can open it in a browser , also I have taken a screen shot for it 
* I have uploaded a screenshot for a sample report you can find it by name { Sample report screenshot }

