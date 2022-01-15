package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_Page;

public class Facebook_login extends Base_Page
{
@FindBy(id="email")
private WebElement email;

@FindBy(id="pass")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement LogIn;

public Facebook_login(WebDriver driver)
{
super(driver);	
}

public void setEmail(String mail)
{
email.sendKeys(mail);	
}

public void setPassword(String pwd)
{
password.sendKeys(pwd);	
}
public void passBtn()
{
	LogIn.click();	
}
}
