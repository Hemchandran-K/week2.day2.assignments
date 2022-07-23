package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
		System.out.println(
				driver.findElement(By.xpath("(//div[@class=\"large-6 small-12 columns\"]/img)[2]")).isDisplayed());
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[3]")).click();

	}

}
