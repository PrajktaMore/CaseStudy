package functionality;

//This case study folder generates logs using All log4j Configurators

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.TimeSheetElementsCS;

public class TimeSheetFunctionalityCS {
	
	static final Logger logger=Logger.getLogger(TimeSheetFunctionalityCS.class);
  @Test
  public void functions() throws InterruptedException,IOException {
	  
	  //using basic configurator

	//BasicConfigurator.configure();
	  
	  //using xml configurator
	DOMConfigurator.configure("C:\\Users\\prajktaudayku.more\\eclipse-workspace\\CaseStudyMyHCLTimesheet\\src\\test\\resources\\log4j.xml");
	
	  
	  //using properties configurator

	//PropertyConfigurator.configure("C:\\Users\\prajktaudayku.more\\eclipse-workspace\\CaseStudyMyHCLTimesheet\\src\\test\\resources\\log4j.properties");
	
	logger.debug("Example for debug message");
	logger.info("Example for info message");

	logger.warn("Example for warn message");

	logger.error("Example for error message");
	logger.fatal("Example for fatal message");

	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Apps\\ChromeDriver\\chromedriver.exe");
		
		WebDriver d1=new ChromeDriver();
		
        d1.get("https://www.myhcl.com");	
               
        logger.info("browser opened");
        
    	  d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        TimeSheetElementsCS ele=new TimeSheetElementsCS();
        Thread.sleep(5000);

        
        ele.emailID(d1).sendKeys("prajktaudayku.more@hcl.com");
        
        ele.next(d1).click();
        
        ele.password(d1).sendKeys("@Iamagirl7");
        
        Thread.sleep(5000);
        
        ele.signin(d1).submit();
        
        Thread.sleep(5000);

        ele.check(d1).click();
        
        Thread.sleep(6000);

        
        ele.staySignIn(d1).click();
        
        
       ele.search(d1).sendKeys("iTi");
        //Thread.sleep(5000);
      

      List<WebElement> ele1= (List<WebElement>) ele.list(d1);
      
      for(WebElement list:ele1)
		{
			if (list.getText().equalsIgnoreCase("iTime (Time Sheet Management System)"))
			{
		     //Thread.sleep(2000);

			list.click();
	       // Thread.sleep(10000);
			break;
			}
		}
      
     //
      Thread.sleep(5000);

      //boolean e1=ele.timeentry1(d1).getText().equalsIgnoreCase("09:00");
      
     // System.out.println(e1);
      ele.timeentry1(d1).sendKeys("9.00");

      //ele.timeentry2(d1).sendKeys("9.00");
    //  ele.timeentry3(d1).sendKeys("9.00");

    //   ele.timeentry4(d1).sendKeys("9.00");

      Thread.sleep(2000);
    	//ele.save(d1).click();
    	    
  } 	
      
}
