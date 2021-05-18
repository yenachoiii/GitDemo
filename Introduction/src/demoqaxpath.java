import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jflores1\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://demoqa.com/login");
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("infor.qa");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qa*password1");
//		driver.findElement(By.xpath("//button[@id='login']")).click();
		
//		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("infor.qa");
//		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Qa*password1");
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("infor.qa");
	}

}
