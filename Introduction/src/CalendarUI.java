import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\jflores1\\Downloads\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.spicejet.com/");
				
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				driver.findElement(By.xpath("//a[@value='BLR']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
				
				
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
