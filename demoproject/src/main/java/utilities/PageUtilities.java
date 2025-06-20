package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtilities {
	
	WebDriver driver;
	//DropDown
	public void selectByIndex(WebElement element,int index)
	{
		Select select =new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectByVisibleText(WebElement element,String visibleText) 
	{
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);;
	
	}
	
	public void selectByValue(WebElement element,String value)
	{
		Select select =new Select(element);
		select.selectByValue(value);
	}
	//Action class
	public void dragAndDrop(WebElement element1,WebElement element2)
	{
		Actions actions=new Actions(driver);
		actions.dragAndDrop(element1,element2);
	}
	public void contextClick(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.contextClick(element);
	}
	public void moveToElement(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element);
	}
	
	public void doubleClick(WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.doubleClick(element);
	}
	
	public void click(WebElement element1)
	{
		Actions actions=new Actions(driver);
		actions.click(element1);
	}	
	
	public void javaScriptSendKeys(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='hii';", element);
	}	
	public void javaScriptClick(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,100)","");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}	
	
	/*file upload using sendkeys and robot class
	
	public void fileUploaUsingSendKeys(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public void fileUploadUsingRobotClass()
	{
		
	}	*/
}
