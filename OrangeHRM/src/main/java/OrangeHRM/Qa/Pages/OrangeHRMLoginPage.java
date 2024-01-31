package OrangeHRM.Qa.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RK\\eclipse-workspace\\OrangeHRM\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Login URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Maximize URL
		driver.manage().window().maximize();
		//Delete All Cookies
		driver.manage().deleteAllCookies();
		//Used Implicity Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Used Page Load Timeout
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//Passed userID to login
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		//Passed password to login
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		//Click on button to login
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//click on admin name
		driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).click();
		//click on logout button
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		//close url
		driver.close();
		
		
	}

}
