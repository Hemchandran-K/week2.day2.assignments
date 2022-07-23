package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hemchandran");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("K");
		driver.findElement(By.name("reg. E-mail")).sendKeys("hemchandran.99@gmail.com");
		driver.findElement(By.name("reg. password")).sendKeys("password");
		WebElement date = driver.findElement(By.id("date"));
		Select drop1 = new Select(date);
		drop1.selectByValue("10");
		WebElement month = driver.findElement(By.id("month"));
		Select drop2 = new Select(month);
		drop2.selectByVisibleText("August");
		WebElement year = driver.findElement(By.id("year"));
		Select drop3 = new Select(year);
		drop3.deselectByValue("1999");

	}

}
