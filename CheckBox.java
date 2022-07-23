package week2.day2.assignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckBox {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/checkbox.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//div[@class='example']/input[1]")).click();
			System.out.println(driver.findElement(By.xpath("//div[@class='example']/input[1]")).isSelected());
			 WebElement deselect = driver.findElement(By.xpath("//div[@class='example']/input[3]"));
			 System.out.println(deselect);
			 deselect.click();
			 System.out.println("DeSelect only checked");
			 WebElement option1= driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
			 option1.click();
			 System.out.println(option1);
			 WebElement option2= driver.findElement(By.xpath("(//input[@type='checkbox'])[10]"));
			 option2.click();
			 System.out.println(option2);
			 WebElement option3= driver.findElement(By.xpath("(//input[@type='checkbox'])[11]"));
			 option3.click();
			 System.out.println(option3);
			 WebElement option4= driver.findElement(By.xpath("(//input[@type='checkbox'])[12]"));
			 option4.click();
			 System.out.println(option4);
			 WebElement option5= driver.findElement(By.xpath("(//input[@type='checkbox'])[13]"));
			 option5.click();
			 System.out.println(option5);
			 WebElement option6= driver.findElement(By.xpath("(//input[@type='checkbox'])[14]"));
			 option6.click();
			 System.out.println(option6);






			 }
			 }

