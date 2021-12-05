package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadInLeafTapsApplication {

	private static char[] firstName;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
	
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
	    
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pravalika");
	    
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jo");
	    
	    WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select selectSource = new Select(sourceDropDown);
	    selectSource.selectByVisibleText("Website");
	    

	    WebElement meetingCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select selectMeeting = new Select(meetingCampaignDropDown);
	    selectMeeting.selectByVisibleText("Automobile");
	    
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prav");

	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("J");
	    
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
	    
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/10/1995");
	    
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate");
	    
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tech");
	    
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3 Lakhs");
	    
	    WebElement preferredCurrencyDropDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    Select selectPreferredCurrency = new Select(preferredCurrencyDropDown);
	    selectPreferredCurrency.selectByVisibleText("INR - Indian Rupee");
	    
	    WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select selectIndustry = new Select(industryDropDown);
	    selectIndustry.selectByVisibleText("Aerospace");
	    
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("300");
	    
	    WebElement ownershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select selectOwnership = new Select(ownershipDropDown);
	    selectOwnership.selectByVisibleText("Partnership");
	    
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("@34");

	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("312");
	    
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi,I am Pravalika from Chennai");
	    
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learning automation");
	    
	    
	    //contact info
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600 125");
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7894561230");
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
	    
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mother");
        
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ammulujorika@gmail.com");
	    
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/pravalikajorika/program");
	    
	    //primary address
	    
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Pravalika Jorika");
	    
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Pravalika ");

	    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("House number 4/3/27 ");

	    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("medavakkam");

	    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
	    
	    WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select selectProvince = new Select(stateDropDown);
	    selectProvince.selectByVisibleText("California");
	    
	    WebElement countryDropDown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select selectCountry = new Select(countryDropDown);
	    selectCountry.selectByVisibleText("India");

	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600 126");

	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("621"); 
	    
		driver.findElement(By.name("submitButton")).click();
		
        String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
        
        System.out.println(text);
        
		System.out.println(title);
		
		driver.close();
	    
	}

}
