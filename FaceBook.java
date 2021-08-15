package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Anu");
		driver.findElement(By.name("lastname")).sendKeys("Hasan");
		driver.findElement(By.name("reg_email__")).sendKeys("146544321313");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123@athi");
		WebElement birthday=driver.findElement(By.id("day"));
		Select birthdaydrp=new Select(birthday);
		birthdaydrp.selectByValue("16");
		WebElement birthmonth=driver.findElement(By.id("month"));
		Select birthmonthdrp=new Select(birthmonth);
		birthmonthdrp.selectByValue("5");
		WebElement birthyear=driver.findElement(By.id("year"));
		Select birthyeardrp=new Select(birthyear);
		birthyeardrp.selectByValue("2000");
		driver.findElement(By.xpath("//*[text()='Female']")).click();
		
		
		
	}

}
