import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_proccess {

    public WebElement AccountdropdownEle(WebDriver driver)
    {
        By Accountdropdown =By.className("bg-light");
        WebElement AccountdropdownEle= driver.findElement(Accountdropdown);
        return AccountdropdownEle;
    }
    public WebElement LoginEle(WebDriver driver)
    {
        By Login =By.linkText("Login");
        WebElement LoginEle= driver.findElement(Login);
        return LoginEle;
    }
    public WebElement EnteremailEle(WebDriver driver)
    {
        By Enteremail =By.id("email");
        WebElement EnteremailEle= driver.findElement(Enteremail);
        return EnteremailEle;
    }
    public WebElement EnterpassEle(WebDriver driver)
    {
        By Enterpass =By.id("password");
        WebElement EnterpassEle= driver.findElement(Enterpass);
        return EnterpassEle;
    }
    public WebElement ClickloginEle(WebDriver driver)
    {
        By Clicklogin =By.id("submitBTN");
        WebElement ClickloginEle= driver.findElement(Clicklogin);
        return ClickloginEle;
    }

    public WebElement login_statusEle(WebDriver driver)
    {
        By successlogin =By.cssSelector("div[class=\"vt-col bottom-center\"]");
        WebElement successloginEle= driver.findElement(successlogin);
        return successloginEle;
    }



}
