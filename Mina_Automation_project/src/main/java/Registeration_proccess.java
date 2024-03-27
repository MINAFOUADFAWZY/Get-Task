import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registeration_proccess {


    public WebElement AccountdropdownEle(WebDriver driver)
    {
        By Accountdropdown =By.className("bg-light");
        WebElement AccountdropdownEle= driver.findElement(Accountdropdown);
        return AccountdropdownEle;
    }
    public WebElement signupEle(WebDriver driver)
    {
        By signup =By.linkText("Signup");
        WebElement signupEle= driver.findElement(signup);
        return signupEle;
    }


    public WebElement FirstNameEle ( WebDriver driver)
    {
        By FirstName = By.id("firstname");
        WebElement FirstNameEle=driver.findElement(FirstName);
        return FirstNameEle;
    }

    public WebElement LastNameEle ( WebDriver driver)
    {
        By LastName = By.id("last_name");
        WebElement LastNameEle=driver.findElement(LastName);
        return LastNameEle;
    }
    public WebElement CountryEle ( WebDriver driver)
    {
        By Country = By.cssSelector("button[title=\"Select Country\"]");
        WebElement CountryEle=driver.findElement(Country);
        return CountryEle;
    }
    public WebElement CountryselectEle ( WebDriver driver)
    {
        By Countryselect = By.cssSelector("input[type=\"search\"]");
        WebElement CountryselectEle=driver.findElement(Countryselect);
        return CountryselectEle;
    }
    public WebElement PhoneEle ( WebDriver driver)
    {
        By Phone = By.id("phone");
        WebElement PhoneEle=driver.findElement(Phone);
        return PhoneEle;
    }

    public WebElement EmailEle ( WebDriver driver)
    {
        By Email = By.id("user_email");
        WebElement EmailEle=driver.findElement(Email);
        return EmailEle;
    }
    public WebElement PasswordEle ( WebDriver driver)
    {
        By Password = By.id("password");
        WebElement PasswordEle=driver.findElement(Password);
        return PasswordEle;
    }
    public WebElement NotrobotEle ( WebDriver driver)
    {
        By Notrobot = By.cssSelector("div[role=\"presentation\"]");
        WebElement NotrobotEle=driver.findElement(Notrobot);
        return NotrobotEle;
    }

    public WebElement registerbuttondEle ( WebDriver driver)
    {
        By registerbutton = By.id("submitBTN");
        WebElement registerbuttonEle=driver.findElement(registerbutton);
        return registerbuttonEle;
    }

    public WebElement successmsgEle ( WebDriver driver)
    {
        By successmsg = By.cssSelector("div[class=\"rounded border p-3 text-center pt-5 pb-5 bg-light\"]");
        WebElement successmsgEle=driver.findElement(successmsg);
        return successmsgEle;
    }
    public WebElement Regestiration_statusEle(WebDriver driver)
    {
        By Regestiration_status =By.cssSelector("div[class=\"vt-card error\"]");
        WebElement Regestiration_statusEle= driver.findElement(Regestiration_status);
        return Regestiration_statusEle;
    }


}
