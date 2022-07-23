package week2.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		// max my window
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		// Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		// click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// click CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		// click the lead button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// click create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		// Enter companyname
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		// Enter first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Hemchandran", Keys.TAB);
		// Enter the lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");
		// drop down
		// Find the Element
		WebElement market = driver.findElement(By.xpath("(//select[contains(@id,'createLead')])[2]"));
		// include the Select class with webelement
		Select drop2 = new Select(market);
		drop2.selectByIndex(4);
		// print the title
		String title1 = driver.getTitle();
		System.out.println(title1);
		// Click button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		// verify both title are same
		if (title1.equals(title2)) {
			System.out.println("Title is same");

		} else {
			System.out.println("Not equal");
		}

		// loop
		// Print all the option in the Drop down
		// to get options in the dropdown
		List<WebElement> options = drop2.getOptions();
		int size = options.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			WebElement dropOption = options.get(i);
			System.out.println(dropOption.getText());

		}
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

	}

}
