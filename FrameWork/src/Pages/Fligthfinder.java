package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Fligthfinder
{

	WebDriver dr;
	
	public Fligthfinder(WebDriver dr)
	{
		this.dr=dr;
	}
	
	By oneway=By.xpath("//input[@value='oneway']");
	
	By roundtrip=By.xpath("//input[@value='roundtrip']");
	
	By passangers=By.name("passCount");
	
	By continubtn=By.name("findFlights");
	
	public void clickOneWay()
	{
		dr.findElement(oneway).click();
	
	}
	
	public void selectPassangers(String num)
	{
		Select sel = new Select (dr.findElement(passangers));
		
		sel.selectByVisibleText(num);
	}
	
	
	public void clickOnContinu()
	{
		dr.findElement(continubtn).click();
	}
	
	

}
