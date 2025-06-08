package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	
	
	
	@Test
	public void login()
	{
		String username="admin";
		String password="admin";
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement uname=driver.findElement(By.cssSelector("input[placeholder='Username']"));
		uname.sendKeys(username);
		WebElement pswd=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		pswd.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean displayed=dashboard.isDisplayed();
		Assert.assertTrue(displayed,"home page not loaded");
		
		
	}
@Test
	public void invalidUserName()
	{
		String username="abc";
		String password="admin";
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement uname=driver.findElement(By.cssSelector("input[placeholder='Username']"));
		uname.sendKeys(username);
		WebElement pswd=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		pswd.sendKeys(password);
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement alertmsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert=alertmsg.isDisplayed();
		Assert.assertTrue(alert,"home page not loaded");
	}

@Test
public void invalidPassword()
{
	String username="admin";
	String password="password";
	driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
	WebElement uname=driver.findElement(By.cssSelector("input[placeholder='Username']"));
	uname.sendKeys(username);
	WebElement pswd=driver.findElement(By.cssSelector("input[placeholder='Password']"));
	pswd.sendKeys(password);
	WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
	WebElement alertmsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean alert=alertmsg.isDisplayed();
	Assert.assertTrue(alert,"home page not loaded");
}

@Test

public void invalidUserNameAndPassword()
{
	String username="password";
	String password="password123";
	driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
	WebElement uname=driver.findElement(By.cssSelector("input[placeholder='Username']"));
	uname.sendKeys(username);
	WebElement pswd=driver.findElement(By.cssSelector("input[placeholder='Password']"));
	pswd.sendKeys(password);
	WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
	WebElement alertmsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	boolean alert=alertmsg.isDisplayed();
	Assert.assertTrue(alert,"home page not loaded");
}

}
