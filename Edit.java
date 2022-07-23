package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// setup the path
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leafground.com/pages/Edit.html");
		// enter the maximize window
		driver.manage().window().maximize();
		// add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter the mail id
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemchandran.99@gmail.com");
		// Append a text and press keyboard tab
		driver.findElement(By.xpath("//label[contains(text(),'Append')]/following::input"))
				.sendKeys("Hemchandran,keys.TAP");
		// Get default text entered ,get text
		String text = driver.findElement(By.xpath("//label[contains(text(),'Get default')]")).getText();
		// syso
		System.out.println(text);
		// get attribute
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		// syso
		System.out.println(attribute);

		// clear the text and clear me
		driver.findElement(By.xpath("//label[contains(text(),'Clear')]/following::input")).clear();

		// Confirm that edit field is disabled
		boolean displayed = driver.findElement(By.xpath("//label[contains(text(),'Confirm')]/following::input"))
				.isDisplayed();
		System.out.println(displayed);

	}

}
