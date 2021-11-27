package objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TimeSheetElementsCS {
  @Test
  
  public WebElement emailID(WebDriver d1)
  {
	  return d1.findElement(By.id("i0116"));
  }
 
  public WebElement next(WebDriver d1)
  {
	  return d1.findElement(By.id("idSIButton9"));
	  	  
  }
  
  public WebElement password(WebDriver d1)  
  {
  	return d1.findElement(By.id("i0118"));
  }
  
  
  public WebElement signin(WebDriver d1)
  {
 	 return d1.findElement(By.id("idSIButton9"));
 	 
  }
   
  public WebElement check(WebDriver d1)
  {
 	 return d1.findElement(By.id("idChkBx_SAOTCAS_TD"));
 	 
  }
 
  public WebElement staySignIn (WebDriver d1)
  {
	  return d1.findElement(By.id("idSIButton9"));
	  
  }
  
  public WebElement search(WebDriver d1) {  
		  return d1.findElement(By.name("searchtext"));
	  }
	  
public List<WebElement> list(WebDriver d1)
{
	return d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
}
	  
public WebElement timeentry1(WebDriver d1)
{
	return d1.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div/input"));
} 

 
public WebElement timeentry2(WebDriver d1)
{
	return d1.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[2]/div[2]/div/div/div[1]/div/div/div[3]/div/div/div/div/input"));
}

public WebElement timeentry3(WebDriver d1)
{
	return d1.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[2]/div[2]/div/div/div[1]/div/div/div[4]/div/div/div/div/input"));
}

public WebElement timeentry4(WebDriver d1)
{
	return d1.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span[2]/div[2]/div/div/div[1]/div/div/div[5]/div/div/div/div/input"));
}


public WebElement save(WebDriver d1)
{
	return d1.findElement(By.cssSelector("button[id='le_apply'][ng-click='SaveSubmit(10, false)']"));
}

}
