import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jflores1\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http://demoqa.com");
		driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();
		
	}

}