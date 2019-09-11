package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage 
{

	WebDriver dr;
	
	public Homepage(WebDriver dr)
	{
		this.dr=dr;
	}
	//by type variables(like int) to pass arguments
	By username=By.name("userName");
	By password=By.name("password");
	By login=By.name("login");
	
	
	public void login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);
		dr.findElement(this.password).sendKeys(password);
		dr.findElement(this.login).click();
	}
	
}
