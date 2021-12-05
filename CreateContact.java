package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	private static char[] firstName;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
        String title = driver.getTitle();
        
		System.out.println(title);
	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Pravalika");
		
        driver.findElement(By.id("lastNameField")).sendKeys("Jorika");
		
		driver.findElement(By.name("submitButton")).click();
		
        String text = driver.findElement(By.id("viewContact_fullName_sp")).getText();
        
        System.out.println(text);
        
        driver.close();
		
	}

}
