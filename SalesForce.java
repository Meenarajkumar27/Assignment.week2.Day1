package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Athiran");
		driver.findElement(By.name("UserLastName")).sendKeys("Aravind");
		driver.findElement(By.name("UserEmail")).sendKeys("Athiran.Aravind@gmail.com");
		WebElement Title=driver.findElement(By.name("UserTitle"));
		Select titledropdown=new Select(Title);
		titledropdown.selectByValue("IT_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("google");
		WebElement companyEmployees=driver.findElement(By.name("CompanyEmployees"));
		Select companyempdropwown=new Select(companyEmployees);
		companyempdropwown.selectByVisibleText("1501+ employees");
		driver.findElement(By.name("UserPhone")).sendKeys("99447620");
		WebElement CompanyCountry=driver.findElement(By.name("CompanyCountry"));
		Select CompanyCountrydropdown=new Select(CompanyCountry);
		CompanyCountrydropdown.selectByIndex(5);
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
		
		
	}

}
