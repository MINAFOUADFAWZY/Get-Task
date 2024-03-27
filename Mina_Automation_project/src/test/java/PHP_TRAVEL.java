import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PHP_TRAVEL {



    WebDriver driver =null ;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        String chrompath =System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chrompath);
        System.setProperty("webdriver.chrome.silentOutput", "true");
        ChromeOptions Options= new ChromeOptions();
        Options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(Options);

        driver.navigate().to("https://phptravels.net/signup"); //Navigation to the required url
        driver.manage().window().maximize();//maximize the window
        Thread.sleep(5000);



    }

    Login_proccess Diff = new Login_proccess(); // New object from the login process class

    Registeration_proccess Eng = new Registeration_proccess(); // New object from Registeration process class



    @Test(priority=1)
    public void Success_Registeration() throws InterruptedException {


        Eng.FirstNameEle(driver).sendKeys("Test");// Type valid first name
        Eng.LastNameEle(driver).sendKeys("User"); // Type valid last name
        Eng.CountryEle(driver).click(); // click on country dropdown box
        Eng.CountryselectEle(driver).sendKeys("Egypt", Keys.ENTER);// select Egypt from dropdown list
        Eng.PhoneEle(driver).sendKeys("01239448667"); // Enter valid mobile number
        Eng.EmailEle(driver).sendKeys("testuser344@fastmail.com"); // Enter valid email
        Eng.PasswordEle(driver).sendKeys("Test@123"); // Enter valid 8 characters Password
        Thread.sleep(60000); // This Thread is one minute to make the check of "I am not robot "
        Eng.registerbuttondEle(driver).sendKeys(Keys.ENTER); // Click on signup button

       String expected_result1 = " account has been created"; // Expected message to be shown
       Thread.sleep(5000);
        String Actual_result1 = Eng.successmsgEle(driver).getText(); // Actual message
        System.out.println(Actual_result1);
        Assert.assertTrue(Actual_result1.contains(expected_result1)); // Compare Expected with Actual Result



    }

    @Test(priority=2)
    public void Failed_Registeration_user_name() throws InterruptedException {

        Eng.AccountdropdownEle(driver).sendKeys(Keys.ENTER); // click on the Account drop down list
        Eng.signupEle(driver).click(); // choose signup
        Eng.FirstNameEle(driver).sendKeys("test"); // Type Invalid first name start with small letter
        Eng.LastNameEle(driver).sendKeys("user"); // Type Invalid last name start with small letter
        Eng.CountryEle(driver).click();// click on country dropdown list
        Eng.CountryselectEle(driver).sendKeys("Egypt", Keys.ENTER);// select Egypt from dropdown list
        Eng.PhoneEle(driver).sendKeys("1239448667");// Enter valid mobile number
        Eng.EmailEle(driver).sendKeys("testuser345@fastmail.com");// Enter valid email
        Eng.PasswordEle(driver).sendKeys("Test@123");// Enter valid 8 characters Password
        Thread.sleep(60000);// This Thread is one minute to make the check of "I am not robot "
        Eng.registerbuttondEle(driver).sendKeys(Keys.ENTER);// Click on signup button

        String expected_result2 = "account Creation Failed";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result2 = Eng.successmsgEle(driver).getText();// Actual message
        System.out.println(Actual_result2);
        Assert.assertTrue(Actual_result2.contains(expected_result2),"User should be unable to register as user name didn't start with capital letter"); // Compare Expected with Actual Result



    }
    @Test(priority=3)
    public void Failed_Registeration_mobile_number() throws InterruptedException {

        Eng.AccountdropdownEle(driver).sendKeys(Keys.ENTER);// click on the Account drop down list
        Eng.signupEle(driver).click(); // choose signup
        Eng.FirstNameEle(driver).sendKeys("Test"); // Type valid first name
        Eng.LastNameEle(driver).sendKeys("User"); //Type valid last name
        Eng.CountryEle(driver).click(); // click on country dropdown list
        Eng.CountryselectEle(driver).sendKeys("Egypt", Keys.ENTER);// select Egypt from dropdown list
        Eng.PhoneEle(driver).sendKeys("124");//Enter invalid mobile number
        Eng.EmailEle(driver).sendKeys("testuser346@fastmail.com");// Enter valid email
        Eng.PasswordEle(driver).sendKeys("Test@123"); // Enter valid 8 characters Password
        Thread.sleep(60000);// This Thread is one minute to make the check of "I am not robot "
        Eng.registerbuttondEle(driver).sendKeys(Keys.ENTER);// Click on signup button
        String expected_result3 = "account Creation Failed";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result3 = Eng.successmsgEle(driver).getText();// Actual message
        System.out.println(Actual_result3);
        Assert.assertTrue(Actual_result3.contains(expected_result3),"User should be unable to register as moblie number is invalid"); // Compare Expected with Actual Result



    }
    @Test(priority=4)
    public void Failed_Registeration_Email() throws InterruptedException {
        Eng.AccountdropdownEle(driver).sendKeys(Keys.ENTER);// click on the Account drop down list
        Eng.signupEle(driver).click();// choose signup
        Eng.FirstNameEle(driver).sendKeys("Test");// Type valid first name
        Eng.LastNameEle(driver).sendKeys("User");//Type valid last name
        Eng.CountryEle(driver).click();// click on country dropdown list
        Eng.CountryselectEle(driver).sendKeys("Egypt", Keys.ENTER);// select Egypt from dropdown list
        Eng.PhoneEle(driver).sendKeys("1245667887");//Enter valid mobile number
        Eng.EmailEle(driver).sendKeys("testuser244@fastmail.com");// Enter a registered email
        Eng.PasswordEle(driver).sendKeys("Test@123");// Enter valid 8 characters Password
        Thread.sleep(60000);// This Thread is one minute to make the check of "I am not robot "
        Eng.registerbuttondEle(driver).sendKeys(Keys.ENTER);// Click on signup button
        String expected_result4 = "Account already exist";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result4 = Eng.Regestiration_statusEle(driver).getText();// Actual message
        System.out.println(Actual_result4);
        Assert.assertTrue(Actual_result4.contains(expected_result4));// Compare Expected with Actual Result



    }
    @Test(priority=5)
    public void Failed_Registeration_Password() throws InterruptedException {

        Eng.AccountdropdownEle(driver).sendKeys(Keys.ENTER);// click on the Account drop down list
        Eng.signupEle(driver).click();// choose signup
        Eng.FirstNameEle(driver).sendKeys("Test");// Type valid first name
        Eng.LastNameEle(driver).sendKeys("User");//Type valid last name
        Eng.CountryEle(driver).click();// click on country dropdown list
        Eng.CountryselectEle(driver).sendKeys("Egypt", Keys.ENTER);// select Egypt from dropdown list
        Eng.PhoneEle(driver).sendKeys("1256778556");//Enter valid mobile number
        Eng.EmailEle(driver).sendKeys("testuser347@fastmail.com");// Enter valid email
        Eng.PasswordEle(driver).sendKeys("Test");// Enter invalid 4 characters Password
        Thread.sleep(60000);// This Thread is one minute to make the check of "I am not robot "
        Eng.registerbuttondEle(driver).sendKeys(Keys.ENTER);// Click on signup button
        String expected_result5 = "account Creation Failed";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result5 = Eng.successmsgEle(driver).getText();// Actual message
        System.out.println(Actual_result5);
        Assert.assertTrue(Actual_result5.contains(expected_result5),"User should be unable to register because the password doesn't meet the required criteria"); // Compare Expected with Actual Result



    }




    @Test(priority=6)
    public void Success_Login() throws InterruptedException{

        Diff.AccountdropdownEle(driver).sendKeys(Keys.ENTER);// click on the Account drop down list
        Diff.LoginEle(driver).click();// choose Login
        Diff.EnteremailEle(driver).sendKeys("testuser244@fastmail.com");//Enter valid registered email
        Diff.EnterpassEle(driver).sendKeys("Test@123");//Enter valid registered password
        Diff.ClickloginEle(driver).click(); // click on login button
        String expected_result6 = "Account not active";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result6 =Diff.login_statusEle(driver).getText();// Actual message
        System.out.println(Actual_result6);
        Assert.assertTrue(Actual_result6.contains(expected_result6));// Compare Expected with Actual Result




    }

    @Test(priority=7)
    public void Failed_Login_Email() throws InterruptedException{

        Diff.AccountdropdownEle(driver).sendKeys(Keys.ENTER);// click on the Account drop down list
        Diff.LoginEle(driver).click();// choose Login
        Diff.EnteremailEle(driver).sendKeys("testuser@fastmail.com");//Enter invalid unregistered email
        Diff.EnterpassEle(driver).sendKeys("Test@123");//Enter valid registered password
        Diff.ClickloginEle(driver).click();// click on login button
        String expected_result7 = "Invalid Login";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result7 =Diff.login_statusEle(driver).getText();// Actual message
        System.out.println(Actual_result7);
        Assert.assertTrue(Actual_result7.contains(expected_result7));// Compare Expected with Actual Result



    }

    @Test(priority=8)
    public void Failed_Login_password() throws InterruptedException{

        Diff.AccountdropdownEle(driver).sendKeys(Keys.ENTER);// click on the Account drop down list
        Diff.LoginEle(driver).click();// choose Login
        Diff.EnteremailEle(driver).sendKeys("testuser244@fastmail.com");//Enter valid registered email
        Diff.EnterpassEle(driver).sendKeys("123");//Enter INvalid unregistered password
        Diff.ClickloginEle(driver).click();// click on login button
        String expected_result8 = "Invalid Login";// Expected message to be shown
        Thread.sleep(5000);
        String Actual_result8 =Diff.login_statusEle(driver).getText();// Actual message
        System.out.println(Actual_result8);
        Assert.assertTrue(Actual_result8.contains(expected_result8));// Compare Expected with Actual Result



    }




    @AfterTest
    public void closedriver() throws InterruptedException {

        Thread.sleep(10000);

        driver.close();
    }


}
