package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// setup the path
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// enter the maximize window
		driver.manage().window().maximize();
		// add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		// enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		// submit button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// click CRMA/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// click lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// click find lead
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		// click phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		// clear the phonecountrycode
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		// enter the phonecountrycode
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("9");
		// areacode
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
		// enter the phonenumber
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9488732119");
		// get title
		String title = driver.getTitle();
		// syso
		System.out.println(title);
		// clik fidlead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[@id=\"ext-gen478\"]/div/table/thead/tr/td[1]/div")).getText();
		System.out.println(text);

		driver.findElement(By.xpath("//div[contains(@class, 'x-grid3-col-partyId')]//a[1]")).click();
		// Click delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		// click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// enter captured lead id
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10388");
		// click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();// verify message
		System.out.println(text2);
		if (text2.contains("No records to display")) {

			System.out.println("Lead Sucessfuly deleted");

		} else {

			System.out.println("Lead is Not Deleted");
			driver.quit();

		}
	}

}
