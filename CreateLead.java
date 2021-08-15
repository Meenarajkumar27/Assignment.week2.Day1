package week2.day1;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 //driver.get("http://google.com");
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meena");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajkumar");
		 
		 WebElement marketingCampaignId=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select dropdown1 = new Select(marketingCampaignId);
		 dropdown1.selectByIndex(2);
		 
		 WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dropdown4 = new Select(source);
		 dropdown4.selectByVisibleText("Employee");
		 
		
		
	
		  
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Meena");
		  
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Aravind");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/17/94");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mrs");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		  WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		  Select dropdown9=new Select(currency);
		  dropdown9.selectByValue("INR");
			WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			 Select dropdown3 = new Select(ownership);
			  dropdown3.selectByVisibleText("LLC/LLP");
			  WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
				 Select dropdown2 = new Select(industry);
				 dropdown2.selectByValue("IND_HARDWARE");
			  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
			  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
			  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("@@@");
			  driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing1");
			  
			  driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testing2");
			  
			//contact Information  
		WebElement CountryCode= driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
			 CountryCode.clear();
			 CountryCode.sendKeys("91");
			 driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("641025");
			 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8190917893");
			 driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
			 driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Meena");
			 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Meenarajkumar27@gmail.com");
			 driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.meena.com"); 
			 //Primary Address
			 driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Meena"); 
			 driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raj"); 
			 driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("sastri str"); 
			 driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("edayarpalayam"); 
			 driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("coimbatore"); 
			  
			 WebElement countryname=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			 Select drp = new Select(countryname);
			 drp.selectByValue("IND");
			  
			 WebElement statename=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			 Select drp122 = new Select(statename);
			 drp122.selectByValue("IN-TN");
			 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641025"); 
			 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0422"); 
		  	 driver.findElement(By.className("smallSubmit")).click();
		  	 String TilteofthePage="View Lead | opentaps CRM";
		  	 String title=driver.getTitle();
	if(TilteofthePage.equals(title))
	{
		System.out.println(title);
		System.out.println("Pagetitle is  as expected"); 
	}
	else
	{
		System.out.println("Pagetitle is not as expected"); 
	} 
		
	}
}



