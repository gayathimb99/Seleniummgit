package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Generic_read_excel;
import Pom.Facebook_login;

public class ValidLogin extends Base_Test
{
@Test
public void getLogged()
{
String uname=Generic_read_excel.getData("Sheet1", 0, 0);
String pwd=Generic_read_excel.getData("Sheet1", 0, 1);
Facebook_login fb=new Facebook_login(driver);
fb.setEmail(uname);
fb.setPassword(pwd);
fb.passBtn();
Assert.fail();

}
}
