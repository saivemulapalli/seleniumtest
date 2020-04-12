package BasicWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class byNameDemo {

	public static void main(String[] args) {
		WebDriver driver;
    	System.setProperty("webdriver.gecko.driver", 
				"/Selenium/geckodriver.exe");		
		driver = new FirefoxDriver();
		String baseURL = "http://www.netflix.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.name("email")).sendKeys("adyagala7911@gmail.com");
		driver.findElement(By.className("our-story-cta")).click();
		
	}
}
